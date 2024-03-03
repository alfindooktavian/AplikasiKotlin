package com.example.aplikasikotlin

fun main(){
    val a = double(x=5)
    val b = double(x=3)
    println("a x b = $a x $b = ${a*b}")

    println("==============")
    val books = listOf("nature", "biology", "birds", "math")
//  ints.filter { n: Int -> n > 0 }
//    ints.filter { n -> n > 0 }
    println(books.filter { it[1] == 'a' })

    println("==============")
    val instruments = listOf("viola", "cello", "violin")
    val eager = instruments.filter { it [0] == 'v' }
    println("eager: " + eager)

    println("==============")
    val filtered = instruments.asSequence().filter { it[0] == 'c'}
    println("filtered: " + filtered)
    val newlist = eager
    println("newlist: " + newlist)

    println("==============")
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })

    println("==============")
    val list = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(1, 2))
    println(list.flatten())
}

fun double(x: Int):Int = x * 2