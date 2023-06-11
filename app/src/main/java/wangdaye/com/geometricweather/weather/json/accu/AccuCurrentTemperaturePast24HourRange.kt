package wangdaye.com.geometricweather.weather.json.accu

import kotlinx.serialization.Serializable

@Serializable
data class AccuCurrentTemperaturePast24HourRange(
    val Minimum: AccuValueContainer?,
    val Maximum: AccuValueContainer?
)
