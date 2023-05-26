package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

            }
        }
    }


@Composable
fun mytext(){
    Column(modifier = Modifier.fillMaxSize()) {
    Text(text = "Hello there", fontStyle= FontStyle.Italic, fontSize = 40.sp,color= Color.LightGray)
    Text(text = "I'm Daniel")

        Row(modifier=Modifier.fillMaxWidth().background(color = Color.LightGray),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Yes", fontSize = 50.sp)
            Text(text = "No", fontSize = 50.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun mytextPreview() {
    mytext()
    }
