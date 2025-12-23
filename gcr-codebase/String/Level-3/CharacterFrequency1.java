import java.util.Scanner;
import java.util.Arrays;
public class CharacterFrequency1{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String var = scanner.nextLine();
		
		//applying the logic
		String [][]frequency = storeFrequency(var);
		String []unique = storeUniqueCharacter(frequency);
		
		//print the result
		System.out.println("The unique character in string are: "+ Arrays.toString(unique));
		displayResult(frequency);
		
		scanner.close();
	}
	
	// method to store frequency of character
	public static String[][] storeFrequency(String var){
		 int[] freq = new int[256];
        for (int i = 0; i < var.length(); i++) {
            char ch = var.charAt(i);
            freq[ch]++;  
        }
		int count = 0;
		for(int i=0;i<freq.length;i++){
			if(freq[i]>0){
				count++;
			}
		}
		String [][]store = new String[count][2];
		int idx =0;
		for(int i=0; i<256; i++){
			if(freq[i] > 0){
				store[idx][1] = String.valueOf(freq[i]);
				store[idx][0] = String.valueOf((char)i);
				idx++;
			}
		}
		return store;
	}
	
	// store unique character
	public static String[] storeUniqueCharacter(String [][]store){
		String []unique = new String[store.length];
		for(int i=0; i<store.length; i++){
		  unique[i] = store[i][0];
		}
		return unique;
	}
	
	// display the frequency
	public static void displayResult(String[][] frequency){
		System.out.println("\nCharacter\t\tFrequency");
		for(int i=0;i<frequency.length;i++){
			System.out.println(frequency[i][0]+"\t\t\t"+frequency[i][1]);
		}	
	}
}	