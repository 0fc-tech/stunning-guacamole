package com.eniecole.mod4statevm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.eniecole.mod4statevm.ui.theme.TPTheme
import com.eniecole.mod4statevm.ui.theme.Typography

class CounterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CounterPage()
                }
            }
        }
    }
}

@Composable
fun CounterPage(vm : CounterVM = viewModel()) {
    val counter = vm.stateCounter.collectAsState()
    println("nouvel état compteur : ${counter.value}")
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Text("${counter.value}", style = Typography.headlineLarge)
        Row{
            IconButton(onClick = {vm.inc()}) {
                Icon(imageVector = Icons.Default.KeyboardArrowUp,
                    contentDescription = "Up")
            }
            IconButton(onClick = { vm.dec() }) {
                Icon(imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Down")
            }
        }
    }
}