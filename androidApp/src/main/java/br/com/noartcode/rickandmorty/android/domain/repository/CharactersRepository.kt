package br.com.noartcode.rickandmorty.android.domain.repository

import br.com.noartcode.rickandmorty.android.api.entry.Character
import br.com.noartcode.rickandmorty.android.api.entry.Characters
import br.com.noartcode.rickandmorty.android.util.Resource
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

     fun getCharacters(page: Int) : Flow<Resource<Characters>>

     fun getCharactersByName(name: String, page: Int) : Flow<Resource<Characters>>

     suspend fun getCharacterById(id: Int) : Resource<Character>

}