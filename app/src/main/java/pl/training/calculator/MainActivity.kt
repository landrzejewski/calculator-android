package pl.training.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculator()
        }
    }
}

@Composable
fun Calculator() {
    Container()
}

@Composable
fun Container() {
    val buttonSpacing = 8.dp
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGray)
            .padding(padding)
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = spacedBy(buttonSpacing)
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    Calculator()
}