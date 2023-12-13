package pl.training.calculator

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val value = mutableIntStateOf(0)

    val counter: State<Int> get() = value

    fun increment() {
        value.intValue++
    }

    fun decrement() {
        value.intValue--
    }

}