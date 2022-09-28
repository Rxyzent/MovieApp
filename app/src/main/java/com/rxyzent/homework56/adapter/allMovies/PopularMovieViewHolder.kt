package com.rxyzent.homework56.adapter.allMovies

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.rxyzent.homework56.databinding.AllMoviesItemBinding
import com.rxyzent.homework56.model.response.home.popular.Result

class PopularMovieViewHolder(val binding: AllMoviesItemBinding):RecyclerView.ViewHolder(binding.root) {
    fun bindData(data: Result){
        binding.title.text = data.title
        val imageUrl = "https://image.tmdb.org/t/p/original"+data.posterPath
        binding.image.load(imageUrl)
    }
}