import java.util.Scanner;
public class CheckIllegalArgumentException{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();

		//handle exceptions
		System.out.println("Handled Exception: ");
		handledIllegalArgumentException(text);
		scanner.close();
	}
	
	//method to demonstrate Illegal Argument Exception
	public static void generatedIllegalArgumentException(String text){
			int start = 5;
			int end = 2;
			if(start > end){
				throw new IllegalArgumentException("The illegal argument exception is handled"); 
			}				
	}
	
	// method to handle the Check Illegal Argument Exception 
	public static void handledIllegalArgumentException(String text){
		try{
			generatedIllegalArgumentException(text);
		}
		catch(IllegalArgumentException e){
           System.out.println(e.getMessage());
		}
	} 
}	
