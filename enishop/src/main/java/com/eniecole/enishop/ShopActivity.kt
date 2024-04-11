package com.eniecole.enishop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.eniecole.enishop.ui.theme.TPTheme

class ShopActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationShop()
                }
            }
        }
    }
}

@Composable
fun NavigationShop(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = "list"
    ){
        composable("list"){
            ListProductsPage(onClickProduct = {product->
                navController.navigate("detail/${product.id}")
            })
        }
        composable("detail/{product}",
            arguments = listOf(
                navArgument("product") { type = NavType.LongType }
            )
        ){backStackEntry ->
            val productId = backStackEntry.arguments?.
                                getLong("product") ?: -1L
            DetailProductPage(productId)
        }
    }
}







