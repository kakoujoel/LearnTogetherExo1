package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme
import com.example.learntogether.GreetingContentArticle as GreetingContentArticle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background){
                        GreetingContentArticle(
                            title ="",
                            paragraph1 ="",
                            paragraph2 =""

                        )
                }
            }
        }
    }
}

@Composable
fun GreetingContentArticle(title: String,paragraph1: String,paragraph2: String, modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription=""
        )

        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
       Text(
           text = paragraph1,
           modifier=Modifier.padding( 16.dp),
           textAlign = TextAlign.Justify
       )
        Text(
            text = paragraph2,
            modifier = Modifier.padding( 16.dp),
            textAlign = TextAlign.Justify
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        GreetingContentArticle(
            stringResource(R.string.title),
            stringResource(R.string.paragraph1),
            stringResource(R.string.paragraph2)
        )
    }
}