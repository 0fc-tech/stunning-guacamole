package com.eniecole.mod3compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.eniecole.mod3compose.ui.theme.TPTheme
import com.eniecole.mod3compose.ui.theme.Typography

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
                    Scaffold(
                        contentWindowInsets = WindowInsets(8.dp,8.dp,8.dp,8.dp))
                    { innerPadding->
                        //SpecIphone(Modifier.padding(innerPadding))
                        ListContact(Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}

@Composable
fun SpecIphone(modifier: Modifier = Modifier) {
    LazyColumn(modifier.fillMaxWidth()) {
        item{
            Text("Apple iPhone Pro Max",style = Typography.headlineSmall)
            Text("2800€",style = Typography.titleMedium)
            Text("ou 400€/mois")
            //Créer le reste
            AsyncImage(model =
            "https://static.fnac-static.com/multimedia/Images/FR/MDM/18/f1/52/22212888/3756-1/tsp20240308175104/Apple-iPhone-15-Pro-Max-6-7-5G-Double-SIM-256-Go-Natural-Titanium.jpg",
                contentDescription = "Iphone 15 Pro Max",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth())
            Spacer(Modifier.padding(vertical = 8.dp))
            Text("Description",style= Typography.headlineMedium )
            Spacer(Modifier.padding(vertical = 8.dp))
            Text("Ce téléphone vous permettre de vous dépasser avecun processeru ultra puissant et des photos éblouissantes. Avec ça finis les soirées tout seul au cinéma, maintenant vous avez plus de thunes pour y aller")
            Spacer(Modifier.padding(vertical = 8.dp))
            Text("Caractéristiques",style= Typography.headlineMedium )
            Spacer(Modifier.padding(vertical = 8.dp))
            Text("Processeur")
            Text("  19 coeurs")
            Text("  125 AI Threads")
            Text("GPU")
            Text("  125 AI Threads")
            Text("  125 AI Threads")
            Text("Ecran")
            Text("  OLED")
        }
    }
}

@Composable
fun ListContact(modifier: Modifier = Modifier) {
    LazyColumn(modifier) {
        items(List(1000){"$it Prénom Nom"}){contact->
            println(contact)
            OutlinedCard(modifier= Modifier
                .padding(8.dp)
                .fillMaxWidth()){
                Row(Modifier.padding(12.dp)){
                    Icon(imageVector = Icons.Default.AccountCircle,
                        contentDescription = "")
                    Spacer(Modifier.padding(horizontal=8.dp))
                    Text(contact,)
                }
            }
        }
    }
}
