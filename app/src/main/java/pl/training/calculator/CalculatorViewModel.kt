package pl.training.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.util.UUID

class CalculatorViewModel : ViewModel() {

    fun addTodo() {
        messages.add(UUID.randomUUID().toString())
    }

    var state by mutableStateOf(CalculatorState())
    val messages = mutableStateListOf<String>()


}