import java.util.Scanner;
public class FestivalLuckyDraw{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Diwali Mela");
		System.out.println("There is lucky draw for every visitors");
		System.out.println("The visitor will win the gift only if the number choosen by visitor is diviible by 3 and 5");
		System.out.println("Enter the number of visitor: " );
		int visitors = scanner.nextInt();
		
		for(int i=1 ; i<=visitors; i++){
			System.out.println("\nVisitor " + i + ", Draw number :");
			int number = scanner.nextInt();
			
			if(number <=0){
				System.out.println("Invalid input");
				continue;
			}
				
			if(number % 3 == 0  && number % 5 == 0){
				System.out.println("COngratulations! you won a gift");
			}
			else{
				System.out.println("Wrong number, better luck next time");
			}
		}
	}	
}		
		