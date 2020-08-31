package com.example.tiktok.Response;

import com.example.tiktok.Models.MediaObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Users {
    @SerializedName("ALL_POSTS")
    private List<MediaObject> AllPosts;

    public List<MediaObject> getAllPosts() {
        return AllPosts;
    }
}
