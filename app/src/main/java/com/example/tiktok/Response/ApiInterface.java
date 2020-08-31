package com.example.tiktok.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("posts.php")
    Call<Users> performAllPosts();
}
