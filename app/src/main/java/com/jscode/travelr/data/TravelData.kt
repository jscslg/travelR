package com.jscode.travelr.data

import java.util.*

data class TravelData (
    val id:String,
    val destination:String,
    val start:Date,
    val end: Date,
    val name:String,
    val description:String,
    val travellers:List<TravellerData>
)

data class TravellerData(
    val name: String,
    val age: Int
)