package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
        }
    }
}

@Composable
fun image(){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "PATH")
        Image(painter = painterResource(id = R.drawable.path), contentDescription = "PATH")

        Row(modifier=Modifier.fillMaxWidth()) {
            Text(text = "CAR")
            Image(painter = painterResource(id = R.drawable.car), contentDescription = "CAR")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun imagepreview(){
    image()
}