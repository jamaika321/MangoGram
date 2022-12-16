package com.example.mangogram.di.modules

import com.example.api.interfaces.Repository
import com.example.mangogram.data.RepositoryImpl
import dagger.Module

@Module
class DataModule {

    fun provideRepository(): Repository = RepositoryImpl()



}