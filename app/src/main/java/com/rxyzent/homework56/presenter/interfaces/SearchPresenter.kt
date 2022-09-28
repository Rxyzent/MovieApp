package com.rxyzent.homework56.presenter.interfaces

import com.rxyzent.homework56.model.response.search.Result

interface SearchPresenter {
    interface Presenter{
        fun loadData(name:String)
        fun refreshData()
        fun cancel()
        fun destroy()
    }

    interface View{
        fun dataState(isLoading: Boolean)
        fun showSearchedData(data:List<Result>)
        fun showError(message: String)
    }
}