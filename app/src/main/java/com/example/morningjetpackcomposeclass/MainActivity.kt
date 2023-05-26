package com.example.morningjetpackcomposeclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

        }
    }
}




@Composable
fun text() {
    var mContext = LocalContext.current


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Android",
            color = Color.White,
            fontStyle = FontStyle.Italic,
            fontSize = 50.sp
        )


//IMAGES BUTTON
        Button(onClick = {
            mContext.startActivity(Intent(mContext, ImageActivity::class.java))

        },colors=ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Icon(imageVector = Icons.Default.Star, contentDescription = "IMAGES")
            Text(text = "Images", color = Color.Cyan)
        }
        Spacer(modifier = Modifier.height(15.dp))

//LAYOUT BUTTON
        Button(onClick = {
            mContext.startActivity(Intent(mContext, LayoutActivity::class.java))

        },colors=ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "LAYOUT")
            Text(text = "Layout", color = Color.Cyan)
        }
        Spacer(modifier = Modifier.height(15.dp))

//ASSIGNMENT BUTTON
        Button(onClick = {
            mContext.startActivity(Intent(mContext, Assignmentactivity::class.java))
            
        },colors=ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Icon(imageVector = Icons.Default.Build, contentDescription = "ASSIGNMENT")
            Text(text = "Assignment", color = Color.Cyan)
        }
        Spacer(modifier = Modifier.height(15.dp))

//TEXTFIELD BUTTON
        Button(onClick = {
            mContext.startActivity(Intent(mContext, TextFieldActivity::class.java))

        },colors=ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Icon(imageVector = Icons.Default.MailOutline, contentDescription = "TEXTFIELD")
            Text(text = "Form", color = Color.Cyan)
        }
        Spacer(modifier = Modifier.height(15.dp))

//LIST BUTTON
        Button(onClick = {
            mContext.startActivity(Intent(mContext, ListActivity::class.java))

        },colors=ButtonDefaults.buttonColors(containerColor = Color.Black),
        ) {
            Icon(imageVector = Icons.Default.List, contentDescription = "LIST")
            Text(text = "List", color = Color.Cyan)
        }
//CARDACTIVITY BUTTON
        Button(onClick = {
            mContext.startActivity(Intent(mContext, CardActivity::class.java))

        },colors=ButtonDefaults.buttonColors(containerColor = Color.Black),
        ) {
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "CARD")
            Text(text = "CardActivity", color = Color.Cyan)
        }
//CARDASSIGNMENT BUTTON
        Button(onClick = {
            mContext.startActivity(Intent(mContext, CardAssignmentActivity::class.java))

        },colors=ButtonDefaults.buttonColors(containerColor = Color.Black),
        ) {
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "CARD")
            Text(text = "Card", color = Color.Cyan)
        }
//CARTOON BUTTON
        Button(onClick = {
            mContext.startActivity(Intent(mContext, CardCartoonActivity::class.java))

        },colors=ButtonDefaults.buttonColors(containerColor = Color.Black),
        ) {
            Icon(imageVector = Icons.Default.Face, contentDescription = "CARTOON")
            Text(text = "Cartoon", color = Color.Cyan)
        }
//NEXT BUTTON
    }

}


@Preview(showBackground = true)
@Composable
fun textPreview() {
    text()
        }



