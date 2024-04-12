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
    //Filtrer la liste de produit grâce à une catégorier
    fun filter(filter : String){
        //On récupère la liste de produits depuis le Repo et on filtre la liste avec
        //la catégorie passée par l'UI
        //On modifie ensuite l'état de stateProducts -> Recomposition UI
        stateProducts = RepositoryProducts
            .getAll()
            .filter { it.categorie == filter }
    }
}