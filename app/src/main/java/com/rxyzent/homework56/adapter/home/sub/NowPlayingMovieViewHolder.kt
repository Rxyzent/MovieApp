package com.rxyzent.homework56.adapter.home.sub

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.rxyzent.homework56.databinding.SecondSubItemBinding
import com.rxyzent.homework56.model.response.home.nowPlaying.Result

class NowPlayingMovieViewHolder(val binding: SecondSubItemBinding):RecyclerView.ViewHolder(binding.root) {
    fun bindData(data: Result){
        binding.title.text = data.title
        binding.description.text = data.overview
        val posterImageUrl = "https://image.tmdb.org/t/p/original"+data.posterPath
        val imageUrl = "https://image.tmdb.org/t/p/original"+data.backdropPath
        binding.mainImage.load(imageUrl)
        binding.subImage.load(posterImageUrl)
    }
}