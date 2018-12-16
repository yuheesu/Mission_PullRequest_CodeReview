package com.example.yeseul.movieapp.data.remote;

import com.example.yeseul.movieapp.data.model.SearchMovieResponse;
import com.example.yeseul.movieapp.pojo.Movie;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface MovieApi {

    @GET("search/movie.json")
    Single<SearchMovieResponse> searchMovies(@QueryMap Map<String, String> map);

}
