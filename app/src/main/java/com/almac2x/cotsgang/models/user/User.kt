package com.almac2x.cotsgang.models.user

import java.io.Serializable
import androidx.room.Entity
import androidx.room.PrimaryKey

data class User (

    val id : Int,
    val first_name: String,
    val last_name: String,
    val username: String,
    val email: String,
    val address: String,
    val phone: String // Make this to an Int I think?
        ) :Serializable
