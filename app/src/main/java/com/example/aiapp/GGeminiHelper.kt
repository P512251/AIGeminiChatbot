package com.example.aiapp


import androidx.compose.ui.Modifier
import com.google.ai.client.generativeai.GenerativeModel
import com.google.firebase.Firebase
import com.google.firebase.ai.ai
import com.google.firebase.ai.type.GenerativeBackend
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


fun getGeminiResponse(prompt:String,onResponse:(String)->Unit) {
   // API KEY ENTERS HERE
    val apiKey="https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=Enter your Gemini 2.5 pro API Key"
    val generativeModel= Firebase.ai(backend= GenerativeBackend.googleAI()).generativeModel(
            modelName="gemini-2.5-flash",

        )
    CoroutineScope(Dispatchers.IO).launch {
        try{
            val response=generativeModel.generateContent(prompt)
            withContext(Dispatchers.Main)
            {
                onResponse(response.text?:"No response")
            }
        }catch (e:Exception)
        {
            withContext(Dispatchers.Main)
            {
                onResponse("Error:${e.message}")
            }
        }
    }

}
