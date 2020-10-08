package com.virtualstudios.tvshows.models;

import com.google.gson.annotations.SerializedName;

public class TVShow {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private int name;

    @SerializedName("start_date")
    private int startDate;

    @SerializedName("end_date")
    private int endDate;

    @SerializedName("country")
    private int country;

    @SerializedName("network")
    private int network;

    @SerializedName("status")
    private int status;

    @SerializedName("image_thumbnail_path")
    private int thumbnail;

    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public int getCountry() {
        return country;
    }

    public int getNetwork() {
        return network;
    }

    public int getStatus() {
        return status;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
