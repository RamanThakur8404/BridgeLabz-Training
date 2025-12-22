import java.util.Scanner;
public class StringMethods{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input String: ");
		String var = input.next();
		
		//Applying the logic
		char []charArr = findCharacter(var);
		char []charArrBuiltIn = var.toCharArray();
		boolean result = compareString(charArrBuiltIn, charArr);
		
		//print the result
		System.out.println("Are both substrings equal?" + result);
		input.close();
   
       
    }
	
	// method to store the character in array
	public static char[] findCharacter(String var){
		char []charArr = new char[var.length()];
		for(int i=0; i<var.length(); i++){
			charArr[i] = var.charAt(i);
		}
		return charArr;
	}
	
	// method to compare two String
	public static boolean compareString(char[] val1, char[] val2){
		if(val1.length != val2.length){
			return false;
		}
		else{
			for(int i=0 ; i<val1.length; i++){
				if(val1[i] != val2[i]){
					return false;
				}
			}
		return true;
		}	
	}
}
		