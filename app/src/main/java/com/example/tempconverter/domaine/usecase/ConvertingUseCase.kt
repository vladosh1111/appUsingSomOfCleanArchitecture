package com.example.tempconverter.domaine.usecase

class convertingUseCase {

    fun calculate(som: String): String{
       if(som.any() {it.isLetter()}){

           return "ERROR"
       }
       else{

           val c = som.toInt()
           val result = c * 1.8 + 32
           return result.toString()
       }
    }
}