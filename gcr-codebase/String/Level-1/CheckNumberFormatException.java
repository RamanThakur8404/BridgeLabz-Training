import java.util.Scanner;
public class CheckNumberFormatException{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();

		//handle exceptions
		System.out.println("Handled Exception: ");
		handledNumberFormatException(text);
		scanner.close();
	}
	
	//method to demonstrate Check Number Format Exception
	public static void generatedNumberFormatException(String text){
			int number = Integer.parseInt(text);
			System.out.println("Converted number: "+ number);
	}
	
	// method to handle the Check Number Format Exception 
	public static void handledNumberFormatException(String text){
		try{
			generatedNumberFormatException(text);
		}
		catch (NumberFormatException e) {
            System.out.println(" Invalid number format");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException arise");
        }
	} 
}	
