package com.example.historycards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.historycards.ui.theme.HistoryCardsTheme

class startquiz : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val questions = listOf(
                "Christian Barnard performed the first heart transplant?",
                "Nelson Mandela was in Prison for 15 years", "The first world war ender in 1918",
                "The Second world war started in 1948", "Apartheid ended in 1992"
            )
            val answers = listOf("True", "False", "True", "False", "False")
            var scorecard = listOf(0)



            Text(text = "Click True or False")


            Card(
                modifier = Modifier.fillMaxSize()
                    .padding(50.dp)
            ) {

                Text(
                    text = questions[0],
                    modifier = Modifier.padding(24.dp)
                )

                Row {
                    Button(onClick = {
                        
                    }) {
                        Text(text = "True")
                    }


                    Button(onClick = {}) {
                        Text(text = "False")
                    }


                }

            }
        }
    }
}