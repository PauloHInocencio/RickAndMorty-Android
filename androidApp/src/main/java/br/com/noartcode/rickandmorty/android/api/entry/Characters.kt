package br.com.noartcode.rickandmorty.android.api.entry

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Characters(
    val info: PageInfo,
    @field:Json(name="results")
    val characters: List<Character>
)