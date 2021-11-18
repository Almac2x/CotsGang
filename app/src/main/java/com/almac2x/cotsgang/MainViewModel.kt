package com.almac2x.cotsgang

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.almac2x.cotsgang.api.RetrofitInstance
import com.almac2x.cotsgang.models.user.User
import com.almac2x.cotsgang.models.user.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


private const val TAG = "MainViewModel"
class MainViewModel: ViewModel() {

    private lateinit var userRepository: UserRepository

    init {

        userRepository = UserRepository(RetrofitInstance.api)
    }

    private val _users: MutableLiveData<List<User>> = MutableLiveData()
    val users: LiveData<List<User>>
        get() = _users

    fun getUsers(){
        viewModelScope.launch {
            val fetchedUsers = userRepository.getUsers()
            Log.i(TAG,"Got Post: $fetchedUsers")
            _users.value = fetchedUsers
        }
    }
}