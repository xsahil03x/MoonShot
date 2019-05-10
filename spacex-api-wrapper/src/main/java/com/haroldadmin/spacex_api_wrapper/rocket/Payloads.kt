package com.haroldadmin.spacex_api_wrapper.rocket

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Payloads(
    @field:Json(name = "option_1") val option1: String,
    @field:Json(name = "option_2") val option2: String,
    @field:Json(name = "composite_fairing") val compositeFairing: CompositeFairing
)