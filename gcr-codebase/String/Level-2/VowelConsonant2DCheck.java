import java.util.Scanner;
public class VowelConsonant2DCheck{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = scanner.nextLine();
		
		//applying the logic in method
		String[][] vowelConsonant = findVowelConsonant(input);
		
		//print the result
		displayResult(vowelConsonant);
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
	public static String[][] findVowelConsonant(String text) {
        int length = text.length();
		String [][] result = new String [length][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkChar(text.charAt(i));
            
        }
        return result;
    }
	
	// method to display result
	 public static void displayResult(String[][] dstore) {
        System.out.println("\nCharacter\tType");
        for (int i = 0; i < dstore.length; i++) {
            System.out.println(dstore[i][0] + "\t\t" + dstore[i][1]);
        }
    }
}	