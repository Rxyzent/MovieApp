package com.rxyzent.homework56.adapter.detail.sub

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.rxyzent.homework56.databinding.ActorsListItemBinding
import com.rxyzent.homework56.model.response.details.actors.Cast

class ActorsViewHolder(val binding: ActorsListItemBinding):RecyclerView.ViewHolder(binding.root) {
    fun bindData(data:Cast){

        val imageUrl = "https://image.tmdb.org/t/p/original"+data.profilePath
        binding.image.load(imageUrl)
        binding.name.text = data.originalName
        binding.role.text = data.name
    }
}