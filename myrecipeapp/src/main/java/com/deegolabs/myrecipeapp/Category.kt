package com.deegolabs.myrecipeapp

// 실제 응답과 같아야 함

class Category (
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

data class CategoriesResponse(
    val categories: List<Category>
)