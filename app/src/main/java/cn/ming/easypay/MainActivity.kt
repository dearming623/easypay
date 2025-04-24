package cn.ming.easypay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cn.ming.easypay.ui.theme.EasyPayTheme
import cn.ming.lib.easypay.EasyPay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasyPayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    ButtonView()
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
    EasyPayTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonView() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Yellow)) {
        Button(
            onClick = {
                onClickFn()
            },
            modifier = Modifier.size(width = 80.dp, height = 56.dp)
        ) {
            Text(text = "Lorem")
        }
        Text(text = "Lorem")
        Text(text = "Lorem")
        Text(text = "Lorem")
    }
}

fun onClickFn() {
    EasyPay.getA()
    val config = EasyPay.getB()
    println("----------------------------------->>>>>>>>>>>>>>>>>>$config")
}