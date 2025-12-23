import java.util.Scanner;
public class StringTrim {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with spaces:");
        String text = scanner.nextLine();
		
		//applying the logic
        int[] indexes = findStartAndEndIndexes(text);
        String trim = createSubstring(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();
        boolean result = compareString(trim, builtInTrim);
		
		//print the result
        System.out.println("Custom Trim Result: " + trim );
        System.out.println("Built-in Trim Result: " + builtInTrim );
        System.out.println("Both are same: " + result);
		scanner.close();
    }
	
    // method to find start and end index
    public static int[] findStartAndEndIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[] { start, end };
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String output = "";
        for (int i = start; i <= end; i++) {
            output += text.charAt(i);
        }

        return output;
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
}