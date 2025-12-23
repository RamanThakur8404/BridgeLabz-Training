import java.util.Scanner;
public class ReverseString{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		String str = scanner.next();
		
		//applying the logic
		String reverse = reversedString(str);
		
		//display the output
		System.out.println("The reverse of given string is: "+ reverse);
		scanner.close();
	}
	
	// method to reverse the string
	public static String reversedString(String str){
		String result = "";
		for(int i = str.length()-1; i >= 0; i--){
			result+= str.charAt(i);
		}
		return result;
	}
}