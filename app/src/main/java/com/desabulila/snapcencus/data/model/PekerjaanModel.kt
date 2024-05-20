package com.desabulila.snapcencus.data.model

import com.google.gson.annotations.SerializedName

data class PekerjaanModel(
    @field:SerializedName("nama")
    val nama: String? = null,
    @field:SerializedName("id")
    val id: String? = null
)