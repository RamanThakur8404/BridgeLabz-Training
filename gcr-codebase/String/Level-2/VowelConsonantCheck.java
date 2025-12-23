import java.util.Scanner;
public class VowelConsonantCheck{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = scanner.nextLine();
		
		//applying the logic in method
		int[] vowelConsonantCount = findVowelConsonantCount(input);
		
		//print the result
		System.out.println("Vowels Count: " + vowelConsonantCount[0]);
        System.out.println("Consonants Count : " + vowelConsonantCount[1]);
		scanner.close();
	}
	
	//check for character type
	public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

	//count the vowel and consonant 
	public static int[] findVowelConsonantCount(String text) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkChar(ch);
            if (result.equals("Vowel")) {
                vowels++;
            }
			else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }
}	