package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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

class CardAssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            food()
        }
    }
}

@Composable
fun food(){
    var scrollState= rememberScrollState()
    
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState), horizontalAlignment = Alignment.CenterHorizontally) {
        //IMAGE1
        Card(modifier = Modifier
            .background(color = Color.Yellow)
            .padding(all = 30.dp)
        ) {
            Column(modifier = Modifier.padding(all=15.dp)) {
                Text(text = "COFFEE", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                androidx.compose.foundation.Image(
                    painter = painterResource(id = R.drawable.coffee),
                    contentDescription = "COFFEE",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .clip(shape = RectangleShape))

            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        //IMAGE2
        Card(modifier = Modifier
            .background(color = Color.Cyan)
            .padding(all = 30.dp)
        ) {
            Column(modifier = Modifier.padding(all=15.dp)) {
                Text(text = "EGG", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                androidx.compose.foundation.Image(
                    painter = painterResource(id = R.drawable.egg),
                    contentDescription = "EGG",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .clip(shape = RectangleShape))

            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        //IMAGE3
        Card(modifier = Modifier
            .background(color = Color.Yellow)
            .padding(all = 30.dp)
        ) {
            Column(modifier = Modifier.padding(all=15.dp)) {
                Text(text = "STRAWBERRIES", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                androidx.compose.foundation.Image(
                    painter = painterResource(id = R.drawable.strawberry),
                    contentDescription = "STRAWBERRY",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .clip(shape = RectangleShape))

            }
        }

        Spacer(modifier = Modifier.height(20.dp))

    }
}

@Preview(showBackground = true)
@Composable
fun foodpreview(){
    food()
}