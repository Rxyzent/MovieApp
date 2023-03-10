package com.rxyzent.homework56.model.response.home.topRated


import com.google.gson.annotations.SerializedName

data class TopRatedMovieResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)