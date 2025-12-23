import java.util.Scanner;
public class NonRepeatCharacter{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String var = scanner.next();
		
		//applying the logic
		int []frequency = storeFrequency(var);
		char nonRepeatCharacter = firstUniqueCharacter(frequency,var);
		
		//print the result
		System.out.println("The first non-repeating character is:"+nonRepeatCharacter);
		scanner.close();
	}
	
	// method to store frequency of character
	public static int[] storeFrequency(String var){
		 int[] freq = new int[256];
        for (int i = 0; i < var.length(); i++) {
            char ch = var.charAt(i);
            freq[ch]++;  
        }
		return freq;
	}
	
	// method to find first non-repeating character
	public static char firstUniqueCharacter(int []freq, String var){
        for (int i = 0; i < var.length(); i++) {
            char ch = var.charAt(i);
			if(freq[ch]==1){
				return ch;
			}
       }
	   return '\0';
	}
}	