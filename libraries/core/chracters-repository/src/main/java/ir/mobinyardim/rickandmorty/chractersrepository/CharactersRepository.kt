package ir.mobinyardim.rickandmorty.chractersrepository

import androidx.paging.PagingData
import ir.mobinyardim.rickandmorty.models.Character
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    fun getAllCharacters(viewModelScope: CoroutineScope): Flow<PagingData<Character>>

    suspend fun getCharacter(id: Int): Character

    suspend fun saveCharacter(character: Character)

    suspend fun unSaveCharacter(character: Character)

    fun getSavedCharacters(): Flow<List<Character>>

    fun getSavedCharactersAsPaging(): Flow<PagingData<Character>>
}