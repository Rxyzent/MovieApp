package com.rxyzent.homework56.presenter.interfaces

import com.rxyzent.homework56.model.response.details.actors.Cast
import com.rxyzent.homework56.model.response.details.detail.DetailResponse

interface DetailPresenter {
    interface Presenter{
        fun loadData(movie_id:Int)
        fun refreshData()
        fun cancel()
        fun destroy()
    }

    interface View{
        fun dataState(isLoading: Boolean)
        fun showSimilarMovies(similar:List<com.rxyzent.homework56.model.response.details.similar.Result>)
        fun showActors(actor:List<Cast>)
        fun showDetails(data: DetailResponse)
        fun showTrailers(trailers:List<com.rxyzent.homework56.model.response.details.trailer.Result>)
        fun showError(message: String)
    }
}