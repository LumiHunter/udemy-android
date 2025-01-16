package com.deegolabs.navigationsample

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 버튼을 이용해서 한 화면에서 다른 화면으로 이동하려면 두 가지가 필요하다.
// 1. Screen이 호출되었을 때 실행될 실행할 코드(함수) -> navigationToSecondScreen()
// 2. composable의 매개변수 route를 경로로 하는 컴포저블이 실행될 때 무슨 일이 일어나야 하는지
@Composable
fun FirstScreen(navigationToSecondScreen: (String, String) -> Unit) {
    val name = remember { mutableStateOf("") }
    val inputAge = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("This is the First Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = name.value,
            onValueChange = {
                name.value = it
            },
            label = { Text("Enter your name") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = inputAge.value,
            onValueChange = {
                inputAge.value = it
            },
            label = { Text("Enter your age") }
        )

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navigationToSecondScreen(name.value, inputAge.value)
        }) {
            Text("Go to Second Screen")
        }
    }
}
