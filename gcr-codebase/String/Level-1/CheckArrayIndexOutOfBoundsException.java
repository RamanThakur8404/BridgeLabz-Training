import java.util.Scanner;
public class CheckArrayIndexOutOfBoundsException{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of names: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		String [] names = new String[number];
		System.out.println("Enter "+ number +" names: ");
		for(int i=0; i<number; i++){
			names[i] = scanner.nextLine();
		}

		//handle exceptions
		System.out.println("Handled Exception: ");
		handledArrayIndexOutOfBoundsException(names);
	}
	
	//method to demonstrate ArrayIndexOutOfBoundsException
	public static void generatedArrayIndexOutOfBoundsException(String[] text){
			System.out.println(text[text.length]);
	}
	
	// method to handle the Array Index Out Of Bounds exception
	public static void handledArrayIndexOutOfBoundsException(String[] text){
		try{
			generatedArrayIndexOutOfBoundsException(text);
		}
		catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e.getMessage());
		}
		catch(RuntimeException e){
			System.out.println(e.getMessage());
		}	
	} 
}	
