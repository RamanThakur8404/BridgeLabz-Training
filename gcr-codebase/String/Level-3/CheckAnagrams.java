import java.util.Scanner;
class CheckAnagrams {
    public static void main(String[] args) {
        // creating scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text first: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter text second: ");
		String text2 = scanner.nextLine();
		
		//applying logic
		boolean isAnagram = checkAnagram(text1,text2);
		
		//print the result
		System.out.println("The two text are anagrams? "+isAnagram);
		scanner.close();
	}

	// check anagrams
	public static boolean checkAnagram(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
			return false;
			}
		}
        return true;
	}	
}
	