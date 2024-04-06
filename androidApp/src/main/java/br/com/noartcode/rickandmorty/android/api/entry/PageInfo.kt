package br.com.noartcode.rickandmorty.android.api.entry

data class PageInfo(
    val count: Int,
    val nextUrl: String,
    val pages: Int,
    val prevUrl: String
)