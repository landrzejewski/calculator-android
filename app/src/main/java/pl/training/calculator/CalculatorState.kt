package pl.training.calculator

data class CalculatorState(
    val firstValue: String = "0",
    val secondValue: String = "",
    val operation: CalculatorOperation? = null
)