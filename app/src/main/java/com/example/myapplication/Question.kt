package com.example.myapplication;

class Question(val sentence: String, val answer: Boolean);

object QuestionBank {
    val questions = listOf(
        Question("¿La capital de Francia es París?", true),
        Question("¿La capital de España es Barcelona?", false),
        Question("¿La capital de Italia es Roma?", true),
        Question("¿La capital de Japón es Tokio?", true),
        Question("¿La capital de Canadá es Toronto?", false),
        Question("¿La capital de Australia es Sídney?", false),
        Question("¿La capital de México es Ciudad de México?", true),
        Question("¿La capital de Brasil es Sao Paulo?", false),
        Question("¿La capital de Alemania es Berlín?", true),
        Question("¿La capital de Argentina es Buenos Aires?", true),
        Question("¿La capital de Rusia es Moscú?", true),
        Question("¿La capital de China es Pekín?", true),
        Question("¿La capital de India es Nueva Delhi?", true),
        Question("¿La capital de Reino Unido es Londres?", true),
        Question("¿La capital de Sudáfrica es Ciudad del Cabo?", false),
        Question("¿La capital de Corea del Sur es Seúl?", true),
        Question("¿La capital de Turquía es Ankara?", true),
        Question("¿La capital de Egipto es El Cairo?", true),
        Question("¿La capital de Argentina es Buenos Aires?", true),
        Question("¿La capital de Canadá es Ottawa?", true),
        Question("¿La capital de Colombia es Bogotá?", true),
        Question("¿La capital de Chile es Santiago?", true),
        Question("¿La capital de Alemania es Múnich?", false),
        Question("¿La capital de Italia es Milán?", false),
        Question("¿La capital de España es Madrid?", true),
        Question("¿La capital de Australia es Canberra?", true),
        Question("¿La capital de Estados Unidos es Nueva York?", false),
        Question("¿La capital de México es Guadalajara?", false),
        Question("¿La capital de Brasil es Río de Janeiro?", false),
        Question("¿La capital de Canadá es Vancouver?", false),
        Question("¿La capital de China es Shanghai?", false),
        Question("¿La capital de Japón es Osaka?", false),
        Question("¿La capital de India es Bombay?", false),
        Question("¿La capital de Argentina es Córdoba?", false),
        Question("¿La capital de Perú es Lima?", true),
        Question("¿La capital de Venezuela es Caracas?", true),
        Question("¿La capital de Francia es Lyon?", false)
    )
}