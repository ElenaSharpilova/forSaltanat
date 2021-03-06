package com.example.weather.storage

import androidx.room.TypeConverter
import com.example.weather.models.DailyForeCast
import com.example.weather.models.HourlyForeCast
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CollectionsConverter {

    @TypeConverter
    fun fromHourlyForecastListToJson(list: List<HourlyForeCast>?) : String? =
        Gson().toJson(list)

    @TypeConverter
    fun fromJsonToHourlyForecastList(json: String?): List<HourlyForeCast>? =
        Gson().fromJson(json, object : TypeToken<List<HourlyForeCast>>() {}.type)

    @TypeConverter
    fun fromDailyForecastListToJson(list: List<DailyForeCast>?) : String? =
        Gson().toJson(list)

    @TypeConverter
    fun fromJsonToDailyForecastList(json: String?): List<DailyForeCast>? =
        Gson().fromJson(json, object : TypeToken<List<DailyForeCast>>() {}.type)
}