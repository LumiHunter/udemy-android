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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(
    name: String,
    age: Int,
    navigateToFirstScreen: (String) -> Unit,
    navigateToThirdScreen: () -> Unit
    ) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("This is the Second Screen", fontSize = 24.sp)
        Text("Welcome ${name}")
        Text("You are ${age}")
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navigateToFirstScreen(name)
        }) {
            Text("Go to First Screen")
        }
        Button(onClick = {
            navigateToThirdScreen()
        }) {
            Text("Go to Third Screen")
        }
    }
}
