package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard()
        }
    }
}

@Composable
fun mycard() {
    var scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //IMAGE1
        Card(
            modifier = Modifier
                .background(color = Color.Black)
                .padding(all = 30.dp)
        ) {
            Column(modifier = Modifier.padding(all = 15.dp)) {
                Text(text = "DOG", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                androidx.compose.foundation.Image(
                    painter = painterResource(id = R.drawable.dog),
                    contentDescription = "DOG",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .clip(shape = RectangleShape)
                )

            }
        }

        Spacer(modifier = Modifier.height(20.dp))
//IMAGE2
        Card(
            modifier = Modifier
                .background(color = Color.Gray)
                .padding(all = 30.dp)
        ) {
            Column(modifier = Modifier.padding(all = 15.dp)) {
                Text(text = "BUTTERFLY", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                androidx.compose.foundation.Image(
                    painter = painterResource(id = R.drawable.butterfly),
                    contentDescription = "BUTTERFLY",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .clip(shape = RectangleShape)
                )

            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        //IMAGE3
        //IMAGE2
        Card(
            modifier = Modifier
                .background(color = Color.Black)
                .padding(all = 30.dp)
        ) {
            Column(modifier = Modifier.padding(all = 15.dp)) {
                Text(text = "ZEBRA", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                androidx.compose.foundation.Image(
                    painter = painterResource(id = R.drawable.zebra),
                    contentDescription = "ZEBRA",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .clip(shape = RectangleShape)
                )

            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}


@Preview(showBackground = true)
@Composable
fun mycardpreview(){
    mycard()
}