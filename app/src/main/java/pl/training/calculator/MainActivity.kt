package pl.training.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement.SpaceAround
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight.Companion.Light
import androidx.compose.ui.text.style.TextAlign.Companion.End
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    val viewModel: CalculatorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculator(viewModel)
        }
    }
}

@Composable
fun Calculator(viewModel: CalculatorViewModel) {
    val buttonSpacing = 8.dp

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGray)
            .padding(padding)
    ) {
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = SpaceAround
        ) {
            Display(viewModel.state)
            Column(
                verticalArrangement = spacedBy(buttonSpacing)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        text = "AC",
                        color = LightGray,
                        modifier = Modifier
                            .aspectRatio(2F)
                            .weight(2F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "Del",
                        color = LightGray,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "/",
                        color = LightGray,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        text = "7",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "8",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "9",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "x",
                        color = orange,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        text = "4",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "5",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "6",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "-",
                        color = orange,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        text = "1",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "2",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "3",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "+",
                        color = orange,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        text = "0",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(2F)
                            .weight(2F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = ".",
                        color = mediumGrey,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = { }
                    )
                    CalculatorButton(
                        text = "=",
                        color = orange,
                        modifier = Modifier
                            .aspectRatio(1F)
                            .weight(1F),
                        onTapListener = {

                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Display(state: CalculatorState) {
    Text(
        text = state.firstValue + (state.operation?.symbol ?: "") + state.secondValue,
        textAlign = End,
        color = White,
        fontWeight = Light,
        fontSize = bigFont,
        maxLines = 1,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = padding)
    )
}

@Composable
fun CalculatorButton(
    text: String,
    color: Color,
    onTapListener: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Center,
        modifier = Modifier
            .clip(RoundedCornerShape(100.dp))
            .background(color)
            .clickable { onTapListener() }
            .then(modifier)
    ) {
        Text(
            text = text,
            fontSize = 36.sp,
            color = White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    Calculator(CalculatorViewModel())
}