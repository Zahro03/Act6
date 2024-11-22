package com.example.meet8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meet8.navigation.MahasiswaApp
import com.example.meet8.ui.screen.SplashView
import com.example.meet8.ui.theme.Meet8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Meet8Theme {
                Scaffold ( modifier = Modifier.fillMaxSize()){ innerPadding ->
                    MahasiswaApp(modifier = Modifier.padding(innerPadding),)
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Meet8Theme {
        Greeting("Android")
    }
}

data class RencanaStudy(
    val mataKuliah : String = "",
    val kelas : String = ""
)

