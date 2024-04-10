package com.eniecole.mod2bibliotheque

import java.time.LocalDateTime

open class Item(
    var titre:String,
    var auteur: String,
    var anneSortie: Int,
    var isAvailable: Boolean = true)