package com.example.retrofitappproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolder {

    @GET("posts")
    Call<List<Posts>> getPosts();

    @GET("comments")
    Call<List<Comments>> getComments(@Query("postId")int id);
}
