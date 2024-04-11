package com.eniecole.enishop

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.eniecole.enishop.ui.theme.Typography

@Composable
fun DetailProductPage(productId : Long,modifier: Modifier = Modifier) {
    LazyColumn(modifier.fillMaxWidth()) {
        item{
            Text(productId.toString(),style = Typography.headlineSmall)
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