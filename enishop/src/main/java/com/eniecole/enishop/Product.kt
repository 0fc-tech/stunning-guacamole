package com.eniecole.enishop

data class Product(
    var id: Long = -1L,
    val title:String,
    val urlImage : String,
    val price : Float,
    val categorie : String)
