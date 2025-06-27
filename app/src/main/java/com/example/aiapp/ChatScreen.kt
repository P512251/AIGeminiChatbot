package com.example.aiapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun ChatScreen(modifier: Modifier = Modifier) {
    var input by remember { mutableStateOf("") }
    var response by remember { mutableStateOf("Ask something........") }
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Gemini AI Chat",fontSize = 22.sp)
        Spacer(modifier = Modifier.height(16.dp))
            // TEXT FIELD FOR INPUT
        TextField(value = input, onValueChange = { input = it },
            modifier = Modifier.fillMaxWidth(),label = { Text("Ask something")})
        Spacer(modifier = Modifier.height(8.dp))
        //Button to send the input to Gemini AI
        Button(onClick = {
            getGeminiResponse(input) {
                reply->
                response=reply
            }

        })
        {
            Text("Send")
        }
        Spacer(Modifier.height(16.dp))
        // Display the response from Gemini AI
        Text(text = "Response:$response", modifier = modifier.fillMaxWidth().verticalScroll(rememberScrollState()))


    }

}