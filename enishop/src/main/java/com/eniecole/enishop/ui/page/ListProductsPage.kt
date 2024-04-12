package com.eniecole.enishop.ui.page

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.eniecole.enishop.bo.Product
import com.eniecole.enishop.ui.theme.Typography
import com.eniecole.enishop.vm.DetailProductViewModel
import com.eniecole.enishop.vm.ListeProductViewModel
import java.util.logging.Filter

val categories = listOf("Watch","Projector","Accessories","Mouse","Microphone", "Monitor","Camera","Tablet")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListProductsPage(
    onClickProduct : (product: Product)->Unit,
    vm : ListeProductViewModel = viewModel()
) {
    var stateSelectedCategory by remember{mutableStateOf<String?>(null)}
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("ENI - SHOP")},
                actions={
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Outlined.ShoppingCart,
                            contentDescription ="Shopping Cart Icon" )
                    }
                }
            )
        }
    ) { innerPadding->
        Column(Modifier.padding(innerPadding)) {
            LazyRow{
                items(categories){category->
                    FilterChip(selected = stateSelectedCategory == category,
                        onClick = {
                            stateSelectedCategory = category
                            vm.filter(category)
                        },
                        label = { Text(category) })
                }
            }
            LazyVerticalGrid(
                columns = GridCells.Adaptive(128.dp),
                Modifier.weight(1f),
            ){
                items(vm.stateProducts){product->
                    Column(Modifier.clickable { onClickProduct(product) }) {
                        Card(
                            Modifier
                                .size(128.dp)
                                .fillMaxWidth()){
                            AsyncImage(model = product.urlImage,
                                contentDescription = product.title,
                                contentScale = ContentScale.FillWidth,
                                modifier = Modifier.padding(16.dp)
                            )
                        }
                        Text(product.title)
                        Text("${product.price}€", style = Typography.titleMedium)
                    }
                }
            }

        }

    }
}








