public class CheckNullPointerException{
	public static void main(String []args){
		String text = null;
		
		//handle exceptions
		System.out.println("Handled Exception: ");
		handledException(text);
	}
	
	// method to generate the nullpointer exception
	public static void generatedException(String text){
		System.out.println(text.length());
	}
	
	// method to handle the nullpointer exception
	public static void handledException(String text){
		try{
			generatedException(text);
		}
		catch(NullPointerException e){
           System.out.println("This "+ e.getMessage());
		}
	} 
}	
