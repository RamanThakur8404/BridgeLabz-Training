import java.util.Scanner;
public class CountVowelAndConsonant{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String text = scanner.nextLine();
		
		//applying logic
		int []count = countVowelAndConsonant(text);
		
		//display the output
		System.out.println("The number of vowel are: " + count[0] + "\n The number of consonant are: " + count[1]);
		scanner.close();
	}
	
	// method to count vowel and consonant
	public static int[] countVowelAndConsonant(String var){
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i=0; i<var.length(); i++){
			if(var.charAt(i) == 'A' || var.charAt(i) == 'E' || var.charAt(i) == 'I'|| var.charAt(i) == 'O' || var.charAt(i) == 'U' || var.charAt(i) == 'a' || var.charAt(i) == 'e' || var.charAt(i) == 'i'|| var.charAt(i) == 'o' || var.charAt(i) == 'u'){
			   vowelCount++;
			}
			else{
				consonantCount++;
			}	
		}
		return new int[]{vowelCount,consonantCount};
	}
}	
