package com.haroldadmin.spacex_api_wrapper.v4

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.time.ZonedDateTime

@JsonClass(generateAdapter = true)
data class RoadsterInfo(
    @Json(name = "name") val name: String?,
    @Json(name = "launch_date_utc") val launchDateUTC: ZonedDateTime?,
    @Json(name = "launch_date_unix") val launchDateUnix: Long?,
    @Json(name = "launch_mass_kg") val launchMassKg: Double?,
    @Json(name = "launch_mass_lbs") val launchMassLbs: Double?,
    @Json(name = "norad_id") val noradID: Int?,
    @Json(name = "epoch_jd") val epochJd: Double?,
    @Json(name = "orbit_type") val orbitType: String?,
    @Json(name = "apoapsis_av") val apoapsisAv: Double?,
    @Json(name = "periapsis_av") val periapsisAv: Double?,
    @Json(name = "semi_major_axis_av") val semiMajorAxisAv: Double?,
    @Json(name = "eccentricity") val eccentricity: Double?,
    @Json(name = "inclination") val inclination: Double?,
    @Json(name = "longitude") val longitude: Double?,
    @Json(name = "periapsis_arg") val periapsisArg: Double?,
    @Json(name = "periapsis_days") val periapsisDays: Double?,
    @Json(name = "speed_kph") val speedKph: Double?,
    @Json(name = "speed_mpg") val speedMph: Double?,
    @Json(name = "earth_distance_km") val earthDistanceKm: Double?,
    @Json(name = "earth_distance_mi") val earthDistanceMiles: Double?,
    @Json(name = "mars_distance_km") val marsDistanceKm: Double?,
    @Json(name = "mars_distance_mi") val marsDistanceMiles: Double?,
    @Json(name = "flickr_images") val flickrImages: List<String>,
    @Json(name = "wikipedia") val wikipedia: String?,
    @Json(name = "video") val video: String?,
    @Json(name = "details") val details: String?
)
