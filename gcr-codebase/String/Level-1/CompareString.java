import java.util.Scanner;
public class CompareString{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Strings: ");
		String value1 = scanner.next();
		String value2 = scanner.next();
		
		//Applying the logic
		boolean compare = compareString(value1, value2);
		boolean sameResult = isSameResult(value1,value2);
		
		//print the result
		System.out.println("The comparison of two methods is same " + compare);
		if(sameResult){
			System.out.println("Both the values are same: " + value1);
		}	
		else{
			System.out.println("Both the values are different and values are "+ value1 + " and " + value2);
		}	
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
	public static boolean isSameResult(String val1, String val2){
		return val1.equals(val2);
	}	
}	