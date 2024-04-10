package com.eniecole.mod4trainsearcher

import androidx.lifecycle.ViewModel

class TrajetViewModel : ViewModel() {
    private val _listeTrajets = listOf("Angers - Paris","Paris - Angers", "Rennes - Nantes", "Marseille - Paris", "Toulouse - Bordeaux", "Nice - Marseille" )
    //State privé et public
    //...MutableStateFlow<Trajet>...
    //.. : StateFlow<Trajet>


    //fun rechercherTrajer(recherche : String)
}

sealed class TrajetState{
    //Ne rien afficher en dessous de la barre de recherche
    object Init : TrajetState()
    class TrajetTrouve(val listeTrajetTrouve: List<String>): TrajetState()
    class PasDeTrajetTrouve(): TrajetState()
}