package com.almac2x.cotsgang

import android.app.Activity
import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.almac2x.cotsgang.databinding.ActivityMainBinding

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
        }
    }



}