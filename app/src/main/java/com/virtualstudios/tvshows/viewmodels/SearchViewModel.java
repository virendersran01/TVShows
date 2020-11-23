package com.virtualstudios.tvshows.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.virtualstudios.tvshows.responses.TVShowsResponse;
import com.virtualstudios.tvshows.respositories.SearchTVShowRepository;

public class SearchViewModel extends ViewModel {

    private SearchTVShowRepository searchTVShowRepository;

    public SearchViewModel(){
        searchTVShowRepository = new SearchTVShowRepository();
    }

    public LiveData<TVShowsResponse> searchTVShow(String query, int page){
        return searchTVShowRepository.searchTVShow(query, page);
    }
}
