import java.util.Scanner;
public class StringLengthCheck{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = scanner.next();
		
		// applying the logic
		int length = findLength(input);
		int builtInLength = input.length();
		
		// print the result
		System.out.println("user-defined length : "+ length);
		System.out.println("built-in length: "+ builtInLength);
		scanner.close();
	}
	
	//  find the length
	public static int findLength(String var){
		int count = 0;
		try{
			while(true)
			{
			var.charAt(count);
			count++;
			}
		}
		catch(StringIndexOutOfBoundsException e){
			return count;
		}
		return count;
	}
}	
