package com.virtualstudios.tvshows.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.virtualstudios.tvshows.responses.TVShowsResponse;
import com.virtualstudios.tvshows.respositories.MostPopularTVShowsRespository;

public class MostPopularTVShowsViewModel extends ViewModel {

    private MostPopularTVShowsRespository mostPopularTVShowsRespository;

    public MostPopularTVShowsViewModel() {
        mostPopularTVShowsRespository = new MostPopularTVShowsRespository();
    }

    public LiveData<TVShowsResponse> getMostPopularTVShows(int page){
        return mostPopularTVShowsRespository.getMostPopularTVShows(page);
    }
}
