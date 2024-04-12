package com.eniecole.enishop.vm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.eniecole.enishop.bo.Product
import com.eniecole.enishop.repository.RepositoryProducts

class ListeProductViewModel : ViewModel() {
    var stateProducts by mutableStateOf<List<Product>>(emptyList())
        private set

    init{
        fetchAll()
    }
    fun fetchAll() : Unit{
        //Récupération du produit N'EST PAS SYNCHRONE
        //_stateProduct.value = RepositoryProducts.findById(id)
        stateProducts = RepositoryProducts.getAll()
    }
    fun filter(filter : String){
        stateProducts = RepositoryProducts
            .getAll()
            .filter { it.categorie == filter }
    }
}