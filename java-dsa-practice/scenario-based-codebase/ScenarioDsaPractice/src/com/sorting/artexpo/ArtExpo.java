package com.sorting.artexpo;
import java.util.*;

public class ArtExpo {

	public static void insertionSort(Artist []artists){
		 for (int i = 1; i < artists.length; i++) {
	            Artist currentArtist = artists[i];
	            String currentTime = currentArtist.time;
	            int j = i - 1;

	            while (j >= 0 && artists[j].time.compareTo(currentTime) > 0) {
	                artists[j + 1] = artists[j];
	                j--;
	            }

	            artists[j + 1] = currentArtist;
	        }
	}	
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of artists: ");
	        int numArtists = scanner.nextInt();
	        scanner.nextLine();

	        Artist[] artists = new Artist[numArtists];

	        for (int i = 0; i < numArtists; i++) {
	            System.out.print("Enter the name of artist " + (i + 1) + ": ");
	            String name = scanner.nextLine();
	            System.out.print("Enter the registration time of artist " + (i + 1));
	            String registrationTime = scanner.nextLine();

	            artists[i] = new Artist(name, registrationTime);
	        }
	        insertionSort(artists);
	        
        // final order
	        for (Artist a : artists)
	        	System.out.println(a.artistName + " had registered at " + a.time);
    }
}