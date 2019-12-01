fun main(args: Array<String>) {
    // Create forEachWord function
    "please print each word".forEachWord { word ->
        println(word)
    }
}

fun String.forEachWord(word: (String) -> Unit): List<String>{
    var theWord: String = this
    var splitString: List<String> = theWord.split(" ")
    for (w in splitString) {
        word(w)
    }
    return splitString
}
