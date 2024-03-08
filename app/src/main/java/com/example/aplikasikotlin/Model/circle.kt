package com.example.aplikasikotlin.Model

class circle(val radius: Double) {
    constructor(name:String) : this(1.0)
    constructor(diameter:Int) : this(diameter / 2.0) {
        println("in diameter constructor")
    }
    init {
        println("Area: ${Math.PI * radius * radius}")
    }
}

fun main() {
    // menggunakan constructor radius
    val circle1 = circle(radius = 12.0)

    // menggunakan constructor name
    val circle2 = circle(name = "Lingkaran 2")

    // menggunakan constructor diameter
    var circle3 = circle(diameter = 16)
}