package br.com.noartcode.rickandmorty.android.api

import br.com.noartcode.rickandmorty.android.util.Resource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun <T> safeApiCall(dispatcher: CoroutineDispatcher, apiCall: suspend () -> T) : Resource<T> {
    return withContext(dispatcher) {
        try {
            Resource.Success(data = apiCall.invoke())
        } catch (throwable: Throwable) {
            when(throwable){
                is NoInternetException -> {
                    Resource.Error(throwable.message ?: "No Internet Connection")
                }
                else -> {
                    throwable.printStackTrace()
                    Resource.Error(message = "Something went wrong!")
                }
            }
        }
    }
}