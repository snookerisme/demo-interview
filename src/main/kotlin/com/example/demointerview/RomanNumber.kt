package com.example.demointerview

class RomanNumber {

    fun resultRomanString(romanString: String): Int{
        val romanI = RomanValue("I",1)
        val romanV = RomanValue("V",5)
        val romanX = RomanValue("X",10)
        val resultRoman = arrayListOf<Int>()

        val romanStringList = romanString.toList()
        for(romanValue in romanStringList){
            println("romanString => $romanValue")
            var value = 0
            if(romanValue.toString() == romanI.name){
                value = romanI.value
            }
            if(romanValue.toString() == romanV.name){
                value = romanV.value
            }
            if(romanValue.toString() == romanX.name){
                value = romanX.value
            }
            resultRoman.add(value)
        }
        println(resultRoman)
        var resultValue = 0;
        for ((index,result) in resultRoman.withIndex()){
            resultValue += if(index < (resultRoman.size - 1)){
                if(result < resultRoman[index + 1]){
                    println("Case -")
                    val resultNext = result * (-1)
                    resultNext
                }else{
                    println("Case +")
                    result
                }
            }else{
                result
            }
        }
        println("resultValue => $resultValue")
        return resultValue;
    }
}

data class RomanValue(
    val name: String,
    val value: Int
)

fun main(){
    val romanNumber = RomanNumber()
    romanNumber.resultRomanString("IX")
}