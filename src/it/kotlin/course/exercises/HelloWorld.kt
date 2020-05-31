package it.kotlin.course.exercises

class HelloWorld {

    fun printMessage(message: String) {
        print(message);
    }
}

fun main(args: Array<String>) {
    var HelloWorld = HelloWorld();
    HelloWorld.printMessage("I'm a Kotlin file!!! ");
}