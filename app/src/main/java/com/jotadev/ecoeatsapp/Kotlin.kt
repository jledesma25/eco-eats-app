package com.jotadev.ecoeatsapp

fun main(){

    println(HttpErroEnum.ServerError.code)
    println(HttpErroEnum.Unauthorized)
    println(Day.MONDAY.dayOfWeek)

    val error : HttpErroEnumSealed = HttpErroEnumSealed.ServerError("No pagaste")

    when(error){
        HttpErroEnumSealed.NotFound -> {

        }
        is HttpErroEnumSealed.ServerError -> {

        }
        is HttpErroEnumSealed.Unauthorized -> {

        }

        HttpErroEnumSealed.Successfull -> {

        }
    }
}

//ENUM
enum class HttpErroEnum(val code:Int){
    Unauthorized(401),
    NotFound(404),
    ServerError(500),
    Successfull(200)
}

enum class Day(val dayOfWeek:Int){
    MONDAY(1),
    TUESDAY(2)
}

//SEALED CLASS
//Mas posibilidad de personalizacion
//Comportamiento indivual
sealed class HttpErroEnumSealed(val code:Int){

    data class Unauthorized(val token:String) : HttpErroEnumSealed(401)
    object NotFound : HttpErroEnumSealed(404)
    data class ServerError(val reason:String) : HttpErroEnumSealed(500)

    object Successfull : HttpErroEnumSealed(200)

}