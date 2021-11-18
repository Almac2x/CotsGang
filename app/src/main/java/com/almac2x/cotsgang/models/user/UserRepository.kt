package com.almac2x.cotsgang.models.user

import com.almac2x.cotsgang.api.ProjectAPI


//add here as a parameter UserDao
class UserRepository(private val api : ProjectAPI){

    suspend fun createUser(user: User){
        api.createUser(user)
    }

    suspend fun getUsers():List<User>{
        return api.getUsers()
    }

}