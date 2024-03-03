package com.example.aplikasikotlin

fun main(){
    var dirtyLevel = 50
    val waterFilter = { dirty : Int -> dirty / 2}
    println("==== 1 ====")
    println(waterFilter(dirtyLevel))
    println("==== 2 ====")

    println(waterFilters(dirtyLevels))
}

var dirtyLevels = 10
val waterFilters: (Int) -> Int = { dirty -> dirty / 2 }