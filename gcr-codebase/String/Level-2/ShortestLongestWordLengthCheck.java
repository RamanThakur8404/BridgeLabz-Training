import java.util.Scanner;
public class ShortestLongestWordLengthCheck{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = scanner.nextLine();
		
		// applying the logic
		String[] words = split(input);
        String[][] result = wordLengthArray(words);
		int []length = findShortestLongest(result);
		// print the result
		System.out.println("\nWord\t\tLength");
		 for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]); // String → int
            System.out.println(result[i][0] + "\t\t" + len);
        }
		
		System.out.println("\n The shortest word length is: "+length[0]);
		System.out.println("\n The longest word length is: "+length[1]);
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
	//method to create 2d array and store word,length
	 public static String[][] wordLengthArray(String[] words) {
        String[][] data = new String[words.length][2];
		for(int i=0;i<words.length; i++){
			data[i][0] = words[i];
			data[i][1] = String.valueOf(words[i].length());
		}
		return data;
	 }	
	 //method to find shortest and longest word lengths
	  public static int[] findShortestLongest(String[][] dstore) {
        int shortest = Integer.parseInt(dstore[0][1]);
        int longest = Integer.parseInt(dstore[0][1]);
        for (int i = 1; i < dstore.length; i++) {
            int len = Integer.parseInt(dstore[i][1]);
            shortest = Math.min(shortest,len);
            longest = Math.max(longest,len);
        }
        return new int[]{shortest, longest};
    }
}	