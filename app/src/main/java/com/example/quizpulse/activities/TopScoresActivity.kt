package com.example.quizpulse.activities

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.quizpulse.screens.TopScoresScreen
import com.example.quizpulse.ui.theme.QuizpulseTheme

/**
 * TopScoreActivity class that extends ComponentActivity
 */
class TopScoresActivity : ComponentActivity() {
    /**
     * onCreate method to set the content of the TopScoreActivity.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizpulseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val context: Context = applicationContext

                    TopScoresScreen(context, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}