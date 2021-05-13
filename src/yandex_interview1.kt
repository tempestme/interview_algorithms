fun main(){
    TransformString()
}

fun TransformString(str:String  = "GGGGGEEEEQQQAAA"){
    /***
     * find base symbol
     * separate every every block with the same letters to substring
     * join substring length + letter to result stringBuffer
     * print result
     */
    if (str.isNullOrEmpty()) return

    val newString = StringBuilder()  //stringBuilder for new transformed string
    var starting = 0 //starting index for symbol block
    var letter: Char = str[0] //current symbol

    /***
     * Method that add string length and
     */
    fun addLetters(subString:String){
        newString.append(subString.length)
        newString.append(letter)
    }

    /***
     * cycle that handles every symbol in string and pass substring of same letters to @addLetters method
     */
    str.forEachIndexed { current, char ->
        if (char != letter){
            addLetters(str.subSequence(starting,current).toString())
            if (current<str.length-1){
                starting = current
                letter = str[starting]
            }
        }
        if (current == str.length-1){
            addLetters(str.subSequence(starting,current+1).toString())
        }
    }

    println("old string: $str")
    println("new string: $newString")
}