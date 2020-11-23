package com.virtualstudios.tvshows.listeners;

import com.virtualstudios.tvshows.models.TVShow;

public interface WatchlistListener {

    void onTVShowClicked(TVShow tvShow);

    void removeTVShowFromWatchlist(TVShow tvShow, int position);
}
