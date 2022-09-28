package com.rxyzent.homework56.adapter.search

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.rxyzent.homework56.databinding.SearchScreenItemBinding
import com.rxyzent.homework56.databinding.SecondSubItemBinding
import com.rxyzent.homework56.model.response.search.Result

class SearchMovieViewHolder(val binding: SearchScreenItemBinding):RecyclerView.ViewHolder(binding.root) {
    fun bindData(data:Result){
        binding.name.text = data.title
        val posterImageUrl = "https://image.tmdb.org/t/p/original"+data.posterPath

        binding.image.load(posterImageUrl)

    }
}