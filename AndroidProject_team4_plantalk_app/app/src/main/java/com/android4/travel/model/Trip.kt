package com.android4.travel.model

import android.graphics.Bitmap
import java.util.*

data class Trip(
    var trip_id:Int,
    var title: String,
    var start_date: Long,
    var end_date: Long,
    var place:String,
    var member:String,
    var phone:String,
    var on_off:Int
)
