package pl.training.calculator

data class CalculatorState(
    val firstValue: String = "",
    val secondValue: String = "",
    val operation: CalculatorOperation? = null
)