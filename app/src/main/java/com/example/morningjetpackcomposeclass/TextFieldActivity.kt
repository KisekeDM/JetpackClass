package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme


class TextFieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            form()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun form(){
    Column(modifier=Modifier.fillMaxSize().background(color= Color.Cyan)) {
        Text(text = "PERSONAL DETAILS", fontSize = 40.sp,color= Color.Black, fontWeight = FontWeight.ExtraBold)
//FIRSTNAME
        var fname by remember{ mutableStateOf("") }
        TextField(
            value = fname ,
            onValueChange = {fname=it},
            label={Text(text="Firstname")},
            placeholder={Text(text="Enter Firstname")},
            modifier= Modifier
                .padding(20.dp)
                .background(color = Color.LightGray),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription ="Icon" )},
            trailingIcon =  {Icon(imageVector = Icons.Default.Check, contentDescription ="Icon" )},
            keyboardOptions= KeyboardOptions(keyboardType = KeyboardType.Text)
        )
//SECONDNAME
        var sname by remember{ mutableStateOf("") }
        TextField(
            value = sname ,
            onValueChange = {sname=it},
            label={Text(text="Secondname")},
            placeholder={Text(text="Enter Secondname")},
            modifier= Modifier
                .padding(20.dp)
                .background(color = Color.LightGray),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription ="Icon" )},
            trailingIcon =  {Icon(imageVector = Icons.Default.Check, contentDescription ="Icon" )},
            keyboardOptions= KeyboardOptions(keyboardType = KeyboardType.Text)
        )
//LASTNAME
        var lname by remember{ mutableStateOf("") }
        TextField(
            value = lname ,
            onValueChange = {lname=it},
            label={Text(text="Lastname")},
            placeholder={Text(text="Enter Lastname")},
            modifier= Modifier
                .padding(20.dp)
                .background(color = Color.LightGray),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription ="Icon" )},
            trailingIcon =  {Icon(imageVector = Icons.Default.Check, contentDescription ="Icon" )},
            keyboardOptions= KeyboardOptions(keyboardType = KeyboardType.Text)
        )
//EMAIL
        var myemail by remember{ mutableStateOf("") }
        TextField(
            value = myemail ,
            onValueChange = {myemail=it},
            label={Text(text="Email")},
            placeholder={Text(text="Enter Email")},
            modifier= Modifier
                .padding(20.dp)
                .background(color = Color.LightGray),
            leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription ="Icon" )},
            trailingIcon =  {Icon(imageVector = Icons.Default.Check, contentDescription ="Icon" )},
            keyboardOptions= KeyboardOptions(keyboardType = KeyboardType.Email)
        )
//PASSWORD
        var pwd by remember{ mutableStateOf("") }
        TextField(
            value = pwd ,
            onValueChange = {pwd=it},
            label={Text(text="Password")},
            placeholder={Text(text="Enter Password")},
            modifier= Modifier
                .padding(20.dp)
                .background(color = Color.LightGray),
            leadingIcon = {Icon(imageVector = Icons.Default.Face, contentDescription ="Icon" )},
            trailingIcon =  {Icon(imageVector = Icons.Default.Check, contentDescription ="Icon" )},
            keyboardOptions= KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation= PasswordVisualTransformation()
        )
//CONTACT
        var contact by remember{ mutableStateOf("") }
        TextField(
            value = contact ,
            onValueChange = {contact=it},
            label={Text(text="Phone Number")},
            placeholder={Text(text="Enter Phone Number")},
            modifier= Modifier
                .padding(20.dp)
                .background(color = Color.LightGray),
            leadingIcon = {Icon(imageVector = Icons.Default.Phone, contentDescription ="Icon" )},
            trailingIcon =  {Icon(imageVector = Icons.Default.Check, contentDescription ="Icon" )},
            keyboardOptions= KeyboardOptions(keyboardType = KeyboardType.Phone)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun formpreview(){

}