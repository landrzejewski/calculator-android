package pl.training.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Counter(viewModel)
        }
    }
}

@Composable
fun Counter(viewModel: CounterViewModel) {
    Column(
        verticalArrangement = spacedBy(space = 10.dp, alignment = CenterVertically),
        horizontalAlignment = CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Current value: ${viewModel.counter.value}")
        Button(onClick = { viewModel.increment() }) {
            Text(text = "Increment")
        }
        Button(onClick = { viewModel.decrement() }) {
            Text(text = "Decrement")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    Counter(CounterViewModel())
}