import java.util.Scanner;
public class SubStringCheck{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Strings: ");
		String value1 = scanner.next();
		
		// Applying the logic
		System.out.println("Enter the start and end index with the range of ( 0 - "+ value1.length() +") both inclusive");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		String subString = findSubString(value1, start, end);
		String subBuiltIn = text.substring(start, end);
		boolean result = compareString(subBuiltIn, subString);
		boolean checkSubString = isSameString(value1, subString);
		
		//print the result
        System.out.println("Substring using charAt(): " + subString);
        System.out.println("Substring using substring(): " + subBuiltIn);
        System.out.println("Are both substrings equal? " + result);
		System.out.println("The comparison of two strings using built-in method return: " + checkSubString );
		scanner.close();
	}
	
	// find SubString from the strings
	public static String findSubString(String s1, int low, int high){
		 String result = "";
        for (int i = low; i < high; i++) {
            result += text.charAt(i);
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
	
	// method to check whether the result is same 
	public static boolean isSameString(String val1, String val2){
		return compareString(val1,val2);
	}	
}	
		
		
		
		