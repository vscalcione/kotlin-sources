package it.kotlin.course.exercises

import java.util.*

class ScientificCalculator {

    fun sum(firstValue: Int, secondValue: Int): Int {
        return firstValue + secondValue
    }

    fun difference(firstValue: Int, secondValue: Int): Int {
        return firstValue + secondValue
    }

    fun product(firstValue: Int, secondValue: Int): Int {
        return firstValue + secondValue

    }
    fun quozient(firstValue: Int, secondValue: Int): Int {
        return firstValue + secondValue
    }

    fun printMenu(){
        println("========== Menu ===========");
        println("1. Sum ");
        println("1. Difference ");
        println("3. Product ");
        println("4. Quozient ");
    }
}

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var calculator = ScientificCalculator();

    calculator.printMenu();
    print("Your choice: ");
    var choice: Int = reader.nextInt();

    if (choice == 1) {
        print("First value: ")
        var firstValue: Int = reader.nextInt()
        print("Second value: ")
        var secondValue: Int = reader.nextInt();
        print("Result is: " + calculator.sum(firstValue, secondValue));
    }
}