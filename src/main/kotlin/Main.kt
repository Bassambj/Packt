package pack

fun main() {
    val basic = Basics()
    basic.welcome()
    basic.getRange()
    println(basic.coumtingDown)
}

class Basics(){
    val pack = "Packet"
    var hellow = "Hello $pack"

    fun welcome(){
        println("$hellow. Welcome!")
    }

    val aToZ = "a".."z"
    val oneToTen = 1..10
    var x: Int = 9
    val nine = x in oneToTen // in test if nine is in range oneToTen

    fun getRange(){
        println("Alphabet range: $aToZ")
        if (nine) (println ("ok, $nine, $x is in $oneToTen"))
    }

    /* Ranges:
    reversed() reversed interval
    Extension for numeric tyoe:
    downTo()   decreasing interval
    rangeTo()  // range to a value
    Examples: */
    val coumtingDown = 100.downTo(0)
    
}


