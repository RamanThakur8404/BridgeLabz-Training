import java.util.Scanner;
public class UniqueCharacter{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String var = scanner.next();
		
		//applying logic 
		char[] unique = findUniqueCharacter(var);

		//print the result
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
		scanner.close();
    }
	
	// find the length of string
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
			// catch the stringindexoutofboundsexception
		}
		return count;
	}
	
	//find unique character of String
	public static char[] findUniqueCharacter(String text){
		int count = findLength(text);
		char []frequency = new char[26];
		int index = 0;
        for (int i = 0; i < count; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                frequency[index++] = current;
            }
		}
		char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = frequency[i];
        }

        return result;	
	}
}	