import java.util.Scanner;
public class YoungestAndTallestFriend {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		//take 3 friends age and height as user input
		System.out.println("Enter the age of friend one: ");
		int ageOfFriendOne = scanner.nextInt();
		System.out.println("Enter the height of friend one: ");
		int heightOfFriendOne = scanner.nextInt();
		System.out.println("Enter the age of friend second: ");
		int ageOfFriendTwo = scanner.nextInt();
		System.out.println("Enter the height of friend second: ");
		int heightOfFriendTwo = scanner.nextInt();
		System.out.println("Enter the age of friend third: ");
		int ageOfFriendThird = scanner.nextInt();
		System.out.println("Enter the height of friend third: ");
		int heightOfFriendThird = scanner.nextInt();
		
		// create method, print the output statement and close scanner object
		int youngestFriend = findYoungestFriend(ageOfFriendOne,ageOfFriendTwo,ageOfFriendThird);
		System.out.println("and it's age is "  + youngestFriend);
		int tallestFriend = findTallestFriend(heightOfFriendOne,heightOfFriendTwo,heightOfFriendThird);
		System.out.println("and it's height is "  + tallestFriend);
		scanner.close();
	}
	
	// method definition for youngestFriend and also for tallestFriend
	public static int findYoungestFriend(int ageOfFriendOne,int ageOfFriendTwo,int ageOfFriendThree){
		if((ageOfFriendOne < ageOfFriendTwo) && (ageOfFriendOne < ageOfFriendThree)) {
			System.out.print("The youngest friend is Freind One ");
			return ageOfFriendOne;	
		}
		else if((ageOfFriendTwo < ageOfFriendOne) && (ageOfFriendTwo < ageOfFriendThree)) {
			System.out.print("The youngest friend is Freind Two ");
			return ageOfFriendTwo;
		}
		else{
			System.out.print("The youngest friend is Freind Three ");
			return ageOfFriendThree;
		}
	}
	public static int findTallestFriend(int heightOfFriendOne,int heightOfFriendTwo,int heightOfFriendThree){
		if((heightOfFriendOne > heightOfFriendTwo) && (heightOfFriendOne > heightOfFriendThree)) {
			System.out.print("The tallest friend is Freind One ");
			return heightOfFriendOne;	
		}
		else if((heightOfFriendTwo > heightOfFriendOne) && (heightOfFriendTwo > heightOfFriendThree)) {
			System.out.print("The tallest friend is Freind Two ");
			return heightOfFriendTwo;
		}
		else{
			System.out.print("The tallest friend is Freind Three ");
			return heightOfFriendThree;
		}
	}		
}	