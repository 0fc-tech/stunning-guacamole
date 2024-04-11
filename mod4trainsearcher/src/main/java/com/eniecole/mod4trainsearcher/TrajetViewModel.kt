package com.eniecole.mod4trainsearcher

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TrajetViewModel : ViewModel() {
    private val _listeTrajets = listOf("Angers - Paris","Paris - Angers", "Rennes - Nantes", "Marseille - Paris", "Toulouse - Bordeaux", "Nice - Marseille" )
    //private var _stateTrajet = MutableStateFlow<TrajetState>(TrajetState.Init)
    //val stateTrajet : StateFlow<TrajetState> = _stateTrajet
    var stateTrajet by mutableStateOf<TrajetState>(TrajetState.Init)
        private set


    fun rechercher(recherche : String){
        val trajetsRecherches = _listeTrajets.filter { it.contains(recherche) }
        if(trajetsRecherches.isEmpty())
            stateTrajet/*.value*/ = TrajetState.PasDeTrajetTrouve()
        else
            stateTrajet/*.value*/ = TrajetState.TrajetTrouve(trajetsRecherches)
    }
}

sealed class TrajetState{
    //Ne rien afficher en dessous de la barre de recherche
    object Init : TrajetState()
    class TrajetTrouve(val listeTrajetTrouve: List<String>): TrajetState()
    class PasDeTrajetTrouve(): TrajetState()
}