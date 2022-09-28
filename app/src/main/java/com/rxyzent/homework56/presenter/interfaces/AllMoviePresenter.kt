package com.rxyzent.homework56.presenter.interfaces

import com.rxyzent.homework56.model.response.base.BaseType

interface AllMoviePresenter {
    interface Presenter{
        fun loadData(movieType:String)
        fun cancel()
        fun destroy()
    }

    interface View{
        fun dataState(isLoading: Boolean)
        fun showData(data:List<BaseType>)
        fun showError(message: String)
    }
}