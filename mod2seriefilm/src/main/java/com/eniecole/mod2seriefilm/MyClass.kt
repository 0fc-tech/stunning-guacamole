package com.eniecole.mod2seriefilm

val mapFilmSerie = mutableMapOf<String,Boolean>()
const val EXIT_FLAG = 4
const val RESTART_FLAG = -1
fun main() {
    var userInput = -1
    do{
        println("Choisissez")
        println("1 - Ajouter un film/série déjà vu")
        println("2 - Ajouter un film/série à voir")
        println("3 - Afficher liste")
        println("4 - Exit")
        userInput = readln().toIntOrNull() ?: RESTART_FLAG
        when(userInput){
            1 -> addMovie(true)
            2 -> addMovie(false)
            3 -> listMovies()
            RESTART_FLAG -> println("⚠️ Vérifiez votre saisie")
        }
    }while(userInput != EXIT_FLAG)
}

fun listMovies() {
    mapFilmSerie.forEach{film->
        println("${film.key} : " +
                "${if (film.value) " Déjà vu" else " à voir" }")
    }
}

fun addMovie(alreadySeen : Boolean) {
    println("Nom du film")
    mapFilmSerie[readln()] = alreadySeen
}