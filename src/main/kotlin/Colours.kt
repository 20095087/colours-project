class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        return colours
    }

    fun numberOfColours (): Int{
        return colours.size
    }

    fun firstColour() : String{
        return colours.first()
    }

    fun lastColour() : String{
        return colours.last()
    }

    fun coloursInAplhabeticOrder() : List<String>{
        return colours.sorted()
    }

    fun coloursInAllCapitals() : List<String>{
        return colours.map { it.uppercase() }
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        return colours.filter { it.startsWith(letter) }
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        return colours.filter { it.length == size }
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        return colours.filter { it.length < size }
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return false
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}