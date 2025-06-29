package com.example.aiapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF8F8F8)), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Welcome to AI Gemini  App", fontSize = 24.sp,style=androidx.compose.ui.text.TextStyle(color = Color.Black))
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { navController.navigate("Chatbot") },colors= ButtonDefaults.buttonColors(
                Color.Unspecified,contentColor = Color.White),shape= RoundedCornerShape(24.dp),modifier=Modifier.height(50.dp).width(200.dp).shadow(8.dp,RoundedCornerShape(24.dp))) {
                Text("Start Chatting",fontSize = 16.sp)
            }
        }
    }

}