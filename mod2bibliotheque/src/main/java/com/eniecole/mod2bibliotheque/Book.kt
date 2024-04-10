package com.eniecole.mod2bibliotheque

import java.time.LocalDateTime

class Book(
    titre:String,
    auteur: String,
    anneSortie: Int,
    var genre: String,
    isAvailable: Boolean = true,
    )
        : Item(titre,auteur, anneSortie, isAvailable), Borrowable {

    override fun borrow(user: User) :Boolean{
        if (isAvailable) {
            isAvailable = false
            println("$titre has been borrowed by ${user.nom}")
            return true
        }
        println("$titre is not available for borrowing")
        return false
    }

    override fun returnItem(user: User) {
        isAvailable = true
        println("$titre has been returned by ${user.nom}")
    }

}