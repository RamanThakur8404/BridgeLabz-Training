import java.util.Scanner;
public class CompareUpperCase{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Strings: ");
		String value = scanner.nextLine();
		String builtInUpperCase = value.toUpperCase();
		String upperCase = convertToUpperCase(value);
		
		//Applying the logic
		boolean result = compareString(builtInUpperCase, upperCase);
		
		//print the result
		System.out.println("Built-in toUpperCase() result is: " + builtInUpperCase);
        System.out.println("User-defined result is: " + upperCase);
        System.out.println("Are both results equal? " + result);
		scanner.close();
	}
	
	//method to convert the uppercase 
	public static String convertToUpperCase(String value){
		String result = "";
		for(char ch : value.toCharArray()){
			if(ch >= 'a' && ch <= 'z'){
				ch = (char)(ch - 32);				
			}
			result += ch;
		}
		return result;
	}
	
	// method to compare two String
	public static boolean compareString(String val1, String val2){
		if(val1.length() != val2.length()){
			return false;
		}
		else{
			for(int i=0 ; i<val1.length(); i++){
				if(val1.charAt(i) != val2.charAt(i)){
					return false;
				}
			}
		return true;
		}	
	}
}	