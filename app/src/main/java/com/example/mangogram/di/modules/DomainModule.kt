package com.example.mangogram.di.modules

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class DomainModule(private val context: Context) {

    @Provides
    fun provideAppContext(): Context = context



}