package com.rxyzent.homework56.adapter.home.sub

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.rxyzent.homework56.databinding.FirstSubItemBinding
import com.rxyzent.homework56.model.response.home.topRated.Result

class TopRatedMovieViewHolder(val binding: FirstSubItemBinding):RecyclerView.ViewHolder(binding.root) {
    fun bindData(data: Result){
        binding.title.text = data.title
        val imageUrl = "https://image.tmdb.org/t/p/original"+data.posterPath
        binding.image.load(imageUrl)
    }
}