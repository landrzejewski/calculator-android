package pl.training.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Counter()
        }
    }
}

@Composable
fun Counter() {
    val value = remember { mutableIntStateOf(0) }
    Column(
        verticalArrangement = spacedBy(space = 10.dp, alignment = CenterVertically),
        horizontalAlignment = CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Current value: ${value.intValue}")
        Button(onClick = { value.intValue++ }) {
            Text(text = "Increment")
        }
        Button(onClick = { value.intValue-- }) {
            Text(text = "Decrement")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    Counter()
}