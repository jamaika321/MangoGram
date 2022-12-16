package com.example.mangogram

import android.app.Application
import com.example.entities.presentation.BaseDaggerComponent
import com.example.mangogram.di.components.AppComponent
import com.example.mangogram.di.components.DaggerAppComponent
import com.example.mangogram.di.modules.DomainModule

class App: Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(DomainModule(this))
    }

}