package com.example.yeseul.movieapp.data.source.movie;

import com.example.yeseul.movieapp.data.model.SearchMovieResponse;
import com.example.yeseul.movieapp.pojo.Movie;

import java.util.List;
import java.util.Map;

import io.reactivex.Single;

public interface MovieDataSource {

    Single<SearchMovieResponse> searchMovies(Map<String, String> request);
}
