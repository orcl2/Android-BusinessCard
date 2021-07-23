package br.com.williamdsk.businesscard.data

import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BusinessCardRepository(private val dao: BusinessCardDao){

    fun insert(businessCard: BusinessCard) = runBlocking {
        launch(Dispatchers.IO){
            dao.insert(businessCard)
        }
    }

    fun getAll() = dao.getAll()
}