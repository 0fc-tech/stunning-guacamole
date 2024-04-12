package com.eniecole.enishop.vm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.eniecole.enishop.bo.Product
import com.eniecole.enishop.repository.RepositoryProducts
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DetailProductViewModel : ViewModel() {
    //private var _stateProduct = MutableStateFlow<Product?>(null)
    //val stateProduct : StateFlow<Product?> = _stateProduct
    var stateProduct by mutableStateOf<Product?>(null)
        private set

    fun fetchById(id: Long) : Unit{
        //Récupération du produit N'EST PAS SYNCHRONE
        //_stateProduct.value = RepositoryProducts.findById(id)
        stateProduct = RepositoryProducts.findById(id)
    }
}