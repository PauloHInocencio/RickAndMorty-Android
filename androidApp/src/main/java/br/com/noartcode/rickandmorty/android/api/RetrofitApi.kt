package br.com.noartcode.rickandmorty.android.api

import br.com.noartcode.rickandmorty.android.api.entry.Character
import br.com.noartcode.rickandmorty.android.api.entry.Characters
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitApi {

    @GET("character")
    suspend fun characters(@Query("page") page: Int) : Characters

    @GET("character")
    suspend fun charactersByName(@Query("name") name:String, @Query("page") page: Int) : Characters

    @GET("character/{id}")
    suspend fun characterById(@Path("id") id:Int) : Character

}
