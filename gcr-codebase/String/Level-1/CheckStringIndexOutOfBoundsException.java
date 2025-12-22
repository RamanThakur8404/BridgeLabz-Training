import java.util.Scanner;
public class CheckStringIndexOutOfBoundsException{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		
		// generate the exception
		System.out.println("Generated Exception: ");
		generatedStringIndexOutOfBoundsException(text);
		
		//handle exceptions
		System.out.println("Handled Exception: ");
		handledStringIndexOutOfBoundsException(text);
	}
	
	//method to demonstrate StringIndexOutOfBoundsException
	public static void generatedStringIndexOutOfBoundsException(String text){
			int length = text.length();
			System.out.println(text.charAt(length));
	}
	
	// method to handle the String Index Out Of Bounds exception
	public static void handledStringIndexOutOfBoundsException(String text){
		try{
			generatedStringIndexOutOfBoundsException(text);
		}
		catch(StringIndexOutOfBoundsException e){
           System.out.println("This "+ e.getMessage());
		}
	} 
}	
