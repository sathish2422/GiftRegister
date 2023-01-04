package com.ssvd.authentication.ui.login

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LoginScreen(){
     Scaffold(){
         LazyColumn(){
                    item () {
                        Text(text = "Welcome LOGIN" , style = MaterialTheme.typography.headlineLarge)
                    }
         }
     }

}