package com.eniecole.enishop.bo

data class Product(
    var id: Long = -1L,
    val title:String,
    val urlImage : String,
    val price : Float,
    val categorie : String)
