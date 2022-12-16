package com.example.mangogram.di.components

import android.content.Context
import com.example.entities.presentation.BaseDaggerComponent
import com.example.mangogram.MainActivity
import com.example.mangogram.di.modules.DataModule
import com.example.mangogram.di.modules.DomainModule
import com.example.mangogram.di.modules.ViewModelModule
import com.example.mangogram.ui.fragments.chats.ChatsFragment
import com.example.mangogram.ui.fragments.login.LoginFragment
import com.example.mangogram.ui.fragments.profile.ProfileFragment
import com.example.mangogram.ui.fragments.register.RegisterFragment
import com.example.mangogram.ui.fragments.verify.VerifyFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(domainModule: DomainModule): AppComponent
    }

    fun inject(mainActivity: MainActivity)
    fun inject(chatsFragment: ChatsFragment)
    fun inject(loginFragment: LoginFragment)
    fun inject(profileFragment: ProfileFragment)
    fun inject(registerFragment: RegisterFragment)
    fun inject(verifyFragment: VerifyFragment)
}