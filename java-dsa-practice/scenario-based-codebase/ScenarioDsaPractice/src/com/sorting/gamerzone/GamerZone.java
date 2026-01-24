package com.sorting.gamerzone;
public class GamerZone {

    static void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);
            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    static int partition(Player[] players, int low, int high) {
        int pivot = players[high].score;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (players[j].score >= pivot) {   // descending order
                i++;
                Player temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }
        Player temp = players[i + 1];
        players[i + 1] = players[high];
        players[high] = temp;

        return i + 1;
    }

    static void display(Player[] players) {
        for (Player p : players) {
            System.out.println("\nRanking is "+ p.ranking +"\n" + p.name + " → Score: " + p.score );
        }
    }

    public static void main(String[] args) {

        Player[] players = {
            new Player("yashveer", 850,3),
            new Player("lavesh", 920,1),
            new Player("Aman", 780,4),
            new Player("Amit", 920,1),
            new Player("Kundan", 880,2)
        };

        quickSort(players, 0, players.length - 1);
        display(players);
    }
}