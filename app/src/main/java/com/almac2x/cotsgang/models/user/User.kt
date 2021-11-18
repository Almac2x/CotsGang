package com.almac2x.cotsgang.models.user

import java.io.Serializable

data class User (

    val id : Int,
    val firstName: String,
    val lastName: String,
    val userName: String,
    val email: String,
    val address: String,
    val phone: String // Make this to an Int I think?
        ) :Serializable
