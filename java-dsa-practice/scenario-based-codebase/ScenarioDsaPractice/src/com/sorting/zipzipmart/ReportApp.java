package com.sorting.zipzipmart;
import java.util.Scanner;

public class ReportApp {

	public static void mergeSort(Transaction []transactions, int start,int end) {
		if(start >= end) return;
		
		int mid = start + (end- start)/2;
		mergeSort(transactions,start,mid);
		mergeSort(transactions,mid+1,end);
		merge(transactions,start, mid, end);
		
	}
	
	public static void merge(Transaction []transactions, int start, int mid, int end) {
		Transaction []temp = new Transaction[end-start+1];
		int i = start;
		int k=0;
		int j = mid + 1;
		while(i<mid && mid+1<end) {
            if(transactions[i].date.compareTo(transactions[j].date) < 0 || transactions[i].date.equals(transactions[j].date) && transactions[i].amount <= transactions[j].amount ) {
            	temp[k++] = transactions[i++];
            }
            else {
            	temp[k++] = transactions[j++];
            }
		}
		while(i<=mid) {
			temp[k++] = transactions[i++];
		}
		while(j<=end) {
			temp[k++] = transactions[j++];
		}
		
		for(int low=0; low<temp.length; low++) {
			transactions[start+low] = temp[low];
		}
		
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        Transaction[] transactions = new Transaction[n];

        // Taking user input
        for (int i = 0; i < n; i++) {

            System.out.println("\nTransaction " + (i + 1));

            System.out.print("Enter date (YYYY-MM-DD): ");
            String date = sc.next();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            transactions[i] = new Transaction(date, amount);
        }

        // Sorting transactions
        mergeSort(transactions, 0, n - 1);

        // Display sorted report
        System.out.println("\nSorted Daily Sales Report:");
        for (Transaction t : transactions) {
            System.out.println(t.date + " - ₹" + t.amount);
        }
        sc.close();
    }
}
