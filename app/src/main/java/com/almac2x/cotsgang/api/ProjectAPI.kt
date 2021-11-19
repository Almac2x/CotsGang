package com.almac2x.cotsgang.api

import com.almac2x.cotsgang.models.user.User
import retrofit2.http.*

private const val API_VERSION = "api/v1"

interface ProjectAPI {

    //Users = Students


    //Adds User : Api Call
    @POST("${API_VERSION}/students/")
    suspend fun createUser(@Body user: User): User

    //Gets all the list of Users
    @GET("${API_VERSION}/students")
    suspend fun getUsers(): List<User>

    @DELETE("${API_VERSION}/students/{id}")
    suspend fun deleteUser(@Path("id")studentId: Int)


}