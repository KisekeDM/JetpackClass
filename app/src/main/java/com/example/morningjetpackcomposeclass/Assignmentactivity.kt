package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class Assignmentactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image2()

            }
        }
    }


@Composable
fun image2() {
    Column(modifier = Modifier.fillMaxSize()) {

        Image(painter = painterResource(id = R.drawable.fries), contentDescription = "FRIES")

        Text(text = "A photo of french fries that have been spiced to give them a new look!!French Fries actually originated from Belgium. But what you may not know is the word “french” is synonymous with “frites,” which means to “cut lengthwise” in old English. And, as we all know, they are fried potatoes. Thus the name “French Fry.", fontSize = 20.sp)
    }
}
    @Preview(showBackground = true)
    @Composable
    fun imagepreview2() {
        image2()
    }
