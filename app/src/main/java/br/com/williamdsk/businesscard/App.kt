package br.com.williamdsk.businesscard

import android.app.Application
import br.com.williamdsk.businesscard.data.AppDatabase
import br.com.williamdsk.businesscard.data.BusinessCardRepository

class App : Application() {

    val database by lazy { AppDatabase.getDatabase(this) }

    val repository by lazy { BusinessCardRepository(database.businessDao()) }

}