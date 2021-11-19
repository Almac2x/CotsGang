package com.almac2x.cotsgang

import android.app.Activity
import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.almac2x.cotsgang.databinding.ActivityMainBinding
import com.almac2x.cotsgang.models.user.User
import java.lang.Exception

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity(), LifecycleOwner {

   private lateinit var binding: ActivityMainBinding
   private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]


        binding.loginBtn.setOnClickListener(){
           viewModel.getUsers()

            val newUser = User(first_name = "Darren", last_name = "Calape Jr",
                address = "Pasig",id = -1, username = "JR@1234", email = "daren@whitecloak.com", phone = "56465456456")
            viewModel.createUser(user = newUser)

            viewModel.deleteUser(userID = 1 )

        }
    }



}