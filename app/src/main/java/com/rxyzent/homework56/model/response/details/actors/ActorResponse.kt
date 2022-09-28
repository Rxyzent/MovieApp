package com.rxyzent.homework56.model.response.details.actors


import com.google.gson.annotations.SerializedName
import com.rxyzent.homework56.model.response.base.BaseType

data class ActorResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("cast")
    val cast: List<Cast>,
    @SerializedName("crew")
    val crew: List<Crew>
)