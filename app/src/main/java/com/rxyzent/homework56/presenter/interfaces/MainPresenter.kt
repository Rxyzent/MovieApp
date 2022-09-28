package com.rxyzent.homework56.presenter.interfaces

import com.rxyzent.homework56.model.response.home.popular.Result

interface MainPresenter {
    interface Presenter{
        fun loadData()
        fun refreshData()
        fun cancel()
        fun destroy()
    }
    interface View{
        fun dataState(isLoading: Boolean)
        fun showPopularData(popularData: List<Result>)
        fun showTopRatedData(topRatedData:List<com.rxyzent.homework56.model.response.home.topRated.Result>)
        fun showNowPlayingData(nowPlayingData:List<com.rxyzent.homework56.model.response.home.nowPlaying.Result>)
        fun showUpcoming(upcomingData:List<com.rxyzent.homework56.model.response.home.upcoming.Result>)
        fun showError(message: String)
    }
}