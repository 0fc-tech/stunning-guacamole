package com.eniecole.enishop.ui.page

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.eniecole.enishop.ui.theme.Typography
import com.eniecole.enishop.vm.DetailProductViewModel

@Composable
fun DetailProductPage(productId : Long,
                      modifier: Modifier = Modifier,
                      vm : DetailProductViewModel = viewModel()) {
    vm.fetchById(productId)
    val productState = vm.stateProduct//.collectAsState()
    if(productState/*.value*/ == null){
        Text("Nous recherchons votre produit")
    }else
      LazyColumn(modifier.fillMaxWidth()) {
        item{
            Text(productState/*.value*/!!.title,style = Typography.headlineSmall)
            Text("${productState/*.value*/!!.price}€",style = Typography.titleMedium)
            Text("ou 400€/mois")
            //Créer le reste
            AsyncImage(model =productState/*.value*/!!.urlImage,
                contentDescription = "Iphone 15 Pro Max",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth())
            Spacer(Modifier.padding(vertical = 8.dp))
            Text("Description",style= Typography.headlineMedium )
            Spacer(Modifier.padding(vertical = 8.dp))
            Text(productState/*.value*/!!.categorie)
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