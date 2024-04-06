package br.com.noartcode.rickandmorty

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform