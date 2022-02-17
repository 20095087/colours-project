private val colours = Colours();

fun main(args: Array<String>){
    println("1) The list is: ${colours.getAll()}")
    println()
    println("2) The List has ${colours.numberOfColours()} elements stored")
    println()
    println("3) ${colours.firstColour()} is the first colour in the list")
    println()
    println("4) ${colours.lastColour()} is the last colour in the list")
    println()
    println("5) Sorted list is: ${colours.coloursInAplhabeticOrder()}")
    println()
    println("6) CAPITALIZED list is: ${colours.coloursInAllCapitals()}")
    println()
    println("7) Colours starting with specific letter ${colours.coloursStartingWithLetter('B')} [ B was chosen ]")
    println()
    println("8) Colours with a specific number of chars ${colours.coloursWithSpecificNumberOfChars(6)} [ 6 was chosen]")
    println()
    println("9) ${colours.coloursWithLessCharsThan(6)} have less than less 6 chars ")
    println()
    println("10) True or false, is blue in the list: ${colours.isColourInTheList("blue")}")
    println()
    println("11) The list of colours, each printed on a new line is: ${colours.getAll()}")
    println()
    println("12)")
    for(colour in colours.getAll()){
        println("Colour: $colour")
    }
    println()
    println("13) The reverse list of Colours : ${colours.reverseColours()}")
    println()
    println("14) The first letter of each colour is: ${colours.printFirstLetter()}")
    // this is another way I could've done number 13
    //    for (colour in colours.getAll()){
    //        print(" " + colour.first())
    //    }
    println()
    println("15) The last letter of each colour is: ${colours.printLastLetter()}")



}