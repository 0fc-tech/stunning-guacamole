package com.eniecole.mod4trainsearcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.eniecole.mod4trainsearcher.ui.theme.TPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RechercheTrajet()
                }
            }
        }
    }
}

@Composable
fun RechercheTrajet(vm : TrajetViewModel = viewModel()) {
    var fieldTrajet by remember { mutableStateOf("") }
    val state = vm.stateTrajet
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = fieldTrajet,
            onValueChange = {
                fieldTrajet = it
            },
            label = {Text("Gare de départ")}
        )
        Button(onClick = {vm.rechercher(fieldTrajet) }) {
            Text("RECHERCHER")
        }
        when(state/*.value*/){
            is TrajetState.PasDeTrajetTrouve -> Text("Pas de trajet trouvé")
            is TrajetState.TrajetTrouve ->
                Text("${(state/*.value*/ as TrajetState.TrajetTrouve).listeTrajetTrouve}")
            is TrajetState.Init -> Text ("Recherchez votre trajet ci dessus")
        }
    }

}

