package com.example.aplikasikotlin.Model

class Person(var firstName: String, var lastName:String) {
    var fullName:String = ""
        get() {
            return "$firstName $lastName"
        }
        set(value) {
            val components = value.split(" ")
            firstName = components[0]
            lastName = components[1]
            field = value
        }

}

fun main() {
    val person = Person("Lelouch", "Britania")
    println(person.firstName)
    println(person.fullName)

    // merubah nilai fullname
    person.fullName = "julius novachrono"
    println(person.fullName)
}