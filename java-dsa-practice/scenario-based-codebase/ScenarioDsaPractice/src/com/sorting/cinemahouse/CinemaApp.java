package com.sorting.cinemahouse;
import java.util.Scanner;

public class CinemaApp {
	public static void bubbleSort(MovieShow[] shows) {
        int n = shows.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Sort by show time
                if (shows[j].time.compareTo(shows[j + 1].time) > 0) {
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of shows: ");
        int n = sc.nextInt();
        sc.nextLine();

        MovieShow[] shows = new MovieShow[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nShow " + (i + 1));
            System.out.print("Enter movie name: ");
            String name = sc.nextLine();
            System.out.print("Enter show time (HH:MM): ");
            String time = sc.nextLine();

            shows[i] = new MovieShow(name, time);
        }

        bubbleSort(shows);

        System.out.println("\nSorted Movie Show Timings:");
        for (MovieShow show : shows) {
            System.out.println(show.movieName + " - " + show.time);
        }

        sc.close();
    }
}
