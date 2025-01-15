package com.deegolabs.myrecipeapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _categorieState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categorieState
    // 실제로 recipeState 객체가 변경될 때마다 사용자 인터페이스가 업데이트 되기를 원함.

    init {
        fetchCategories()
    }   // MainViewModel이 초기화되면 fetchCategories() 호출

    private fun fetchCategories() {
        // viewModelScope: suspend 함수가 처리되도록 launch를 제공함.
        // suspend 함수는 백그라운드에서 실행되므로, main thread를 차단하지 않음.
        // suspend 함수를 시작하기 위해서는 코루틴 내에서 시작해야 함.
        viewModelScope.launch {
            try {
                val response = recipeService.getCategories()
                _categorieState.value = _categorieState.value.copy(
                    list = response.categories,
                    loading = false,
                    error = null
                )
            } catch (e: Exception) {
                _categorieState.value = _categorieState.value.copy(
                    loading = false,
                    error = "Error fetching categories ${e.message}"
                )
            }
        }
    }

    data class RecipeState(
        val loading: Boolean = true,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}