package com.rxyzent.homework56.adapter.detail.main

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rxyzent.homework56.adapter.detail.sub.DetailSubAdapter
import com.rxyzent.homework56.databinding.DetailMainListBinding
import com.rxyzent.homework56.model.DetaiListData.DetailListData
import com.rxyzent.homework56.model.response.base.BaseType

class DetailViewHolder(val binding: DetailMainListBinding):RecyclerView.ViewHolder(binding.root) {

    private val adapter = DetailSubAdapter()

    fun bindData(data:DetailListData,onDetailListClick: DetailAdapter.OnDetailListClick?){

        binding.title.text = data.title

        binding.subList.adapter = adapter
        binding.subList.layoutManager = LinearLayoutManager(binding.root.context,LinearLayoutManager.HORIZONTAL,false)

        adapter.setData(data.subItem)

        adapter.onSubItemClick = object :DetailSubAdapter.OnSubListClick{
            override fun onSubClick(subData: BaseType) {
                onDetailListClick?.onDetailClick(subData)
            }

        }


    }
}
