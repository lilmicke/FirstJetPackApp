package com.example.myfirstjetpackcomposeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstjetpackcomposeapp.ui.theme.MyFirstJetpackComposeAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyFirstJetpackComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

      Column(modifier = Modifier
          .fillMaxSize()
          .background(Color.Gray), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(
              text = "Dapp AndroidStudio",
              modifier = modifier.padding(top = 16.dp),
              fontSize = 50.sp, textDecoration = TextDecoration.Underline,
              fontFamily = FontFamily.Cursive,
              color = Color.Blue,
              fontWeight = FontWeight.Bold
          )
          Spacer(modifier = Modifier.height(20.dp))

          Text(text = "welcome home",
              modifier = Modifier.padding(top = 16.dp),
              color = Color.Black,
              fontFamily = FontFamily.SansSerif,
              fontSize = 25.sp

          )
      Image(
          painter = painterResource(id = R.drawable.pic), // Use the resource reference directly
          contentDescription = "Image",
          modifier = Modifier
              .width(
                  250.dp
              )
              .height(150.dp)
              .clip(CircleShape)
              .border(2.dp, Color.Gray, CircleShape)
      )
      var count by remember { mutableStateOf(0) }
      Text(text = "$count",
          modifier = Modifier.padding(bottom = 16.dp),
          color = Color.Black,
          fontFamily = FontFamily.SansSerif,
          fontSize = 25.sp
      )

      Row {


      Button(onClick = {
                       count--
      }, colors =
      ButtonDefaults.buttonColors
          (containerColor = Color.Black,
          contentColor = Color.Yellow), shape = RoundedCornerShape(10.dp)
      ) {
          Text(text = "decrement")
      }


      Button(onClick = {
                       count++
      } , shape = RoundedCornerShape(10.dp)) {
          Text(text = "increment ")


      }
  }
  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    MyFirstJetpackComposeAppTheme {
        Greeting("Android")

    }
}





