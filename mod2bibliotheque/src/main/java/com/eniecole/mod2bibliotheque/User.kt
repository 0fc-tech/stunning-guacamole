package com.eniecole.mod2bibliotheque

class User(
    var nom :String,
    val id: Int,
    val borrowedItems: MutableList<Item> = mutableListOf()
) {
    fun borrow(itemToBorrow : Item){
        if(itemToBorrow is Borrowable){
            itemToBorrow.borrow(this)
            borrowedItems.add(itemToBorrow)
        }
    }
    fun returnItem(itemToReturn : Item){
        if(itemToReturn is Borrowable){
            itemToReturn.returnItem(this)
            borrowedItems.remove(itemToReturn)
        }
    }
}