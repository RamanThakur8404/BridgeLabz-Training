
import java.util.Scanner;
public class PurchaseItemPrice {  
    public static void main(String[] args) {
        //declare variables and assign input through Scanner 
        double unitPrice;
        int quantity;
        Scanner input = new Scanner(System.in); 
        unitPrice = input.nextDouble(); 
        quantity = input.nextInt();     
        
		//calculating total price 
        double totalPrice = unitPrice * quantity; 
        
		//Display the result
        System.out.println("The total purchase price is INR " + totalPrice +" if the quantity " + quantity +" and unit price is INR " + unitPrice); 
    }
}