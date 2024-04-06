package br.com.noartcode.rickandmorty.android.di

import br.com.noartcode.rickandmorty.android.util.CharactersRepositoryFakeImp
import br.com.noartcode.rickandmorty.android.domain.repository.CharactersRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {

    @Provides
    @Singleton
    fun provideFakeCharactersRepository() : CharactersRepository {
        return CharactersRepositoryFakeImp()
    }


}