package com.example.testforlecture

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person (
    val name: String,
    val lastName: String,
    val job: String
    ) : Parcelable