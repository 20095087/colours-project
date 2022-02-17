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
        // made the first character of the string to be capitalized as
        // the colours begin with a capital letter
        return colours.contains(colour.replaceFirstChar { it.uppercase() })
    }

    // my own 3 functions
    // https://stackoverflow.com/questions/51917892/how-to-make-reversed-for-loop-with-array-index-as-a-start-end-point-in-kotlin
    // I had to research how to iterate through an array in reverse and found this thread on stackoverflow
    fun reverseColours(): List<String>{
        var list = mutableListOf<String>()
        for(i in colours.lastIndex downTo 0) {
            list.add(colours[i])
        }
        return list
    }

    fun printFirstLetter(): List<Char>{
        var list = mutableListOf<Char>()
        for (colour in colours){
            list.add(colour.first())
        }
        return list
    }

    fun printLastLetter(): List<Char>{
        var list = mutableListOf<Char>()
        for(colour in colours){
            list.add(colour.last())
        }
        return list
    }
}