package com.example.yeseul.movieapp.view;

public interface BasePresenter {

    void onViewCreated();

    void loadItems(boolean isRefresh);
}
