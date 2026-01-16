package com.sorting.cinemahouse;
class MovieShow {

    String movieName;
    String time; // 24-hour format (e.g., 1430 = 2:30 PM)

    MovieShow(String movieName, String time) {
        this.movieName = movieName;
        this.time = time;
    }
}
