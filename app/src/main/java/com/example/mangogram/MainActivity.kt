package com.example.mangogram

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mangogram.databinding.ActivityMainBinding
import com.example.mangogram.ui.fragments.login.LoginFragment
import com.example.mangogram.utils.APP_ACTIVITY
import com.example.mangogram.utils.replaceFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        (application as App).appComponent.inject(this)

        APP_ACTIVITY = this

        if (true){
            loginScreen()
        }

    }



    private fun loginScreen(){
        replaceFragment(LoginFragment(), false)
    }
}