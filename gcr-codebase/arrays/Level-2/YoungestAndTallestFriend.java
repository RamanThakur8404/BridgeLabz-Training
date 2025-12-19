import java.util.Scanner;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		//take user input
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i]);
            age[i] = scanner.nextInt();
            System.out.println("Enter height of " + names[i]);
            height[i] = scanner.nextDouble();
        }
		
		// find youngest and tallest friends
        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex])
                youngestIndex = i;

            if (height[i] > height[tallestIndex])
                tallestIndex = i;
        }

		// print the result and close the scanner object
        System.out.println("Youngest Friends among Amar, Akbar, and Anthony is: " + names[youngestIndex]);
        System.out.println("Tallest Friends among Amar, Akbar, and Anthony is: " + names[tallestIndex]);
        scanner.close();
    }
}
