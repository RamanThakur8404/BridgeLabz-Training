import java.util.Scanner;
import java.util.Arrays;
public class StringSplitCheck{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String text = scanner.nextLine();
		
		// applying the logic
		String[] words = split(text);
        String[] builtInSplit = text.split(" ");
		
		// print the result
		System.out.println("user-defined split : "+ Arrays.toString(words));
		System.out.println("built-in split: "+ Arrays.toString(builtInSplit));
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
			// block to handle StringIndexOutOfBoundsException
		}
		return count;
	}
	
	// find split manually
	public static String[] split(String text){
		int length = findLength(text);
		int count = 1;
		for(int i=0; i<length; i++){
			if(text.charAt(i)==' '){
				count++;
			}
		}
		String []store = new String[count];
		int index = 0;
        String temp = "";
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                store[index++] = temp;
                temp = "";
            }
        }
        store[index] = temp;
		return store;
	}	
}	