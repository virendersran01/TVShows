package com.virtualstudios.tvshows.responses;

import com.google.gson.annotations.SerializedName;
import com.virtualstudios.tvshows.models.TVShowDetails;

public class TVShowDetailsResponse {

    @SerializedName("tvShow")
    private TVShowDetails tvShowDetails;

    public TVShowDetails getTvShowDetails() {
        return tvShowDetails;
    }
}
