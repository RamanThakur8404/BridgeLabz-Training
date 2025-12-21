import java.util.Scanner;
public class QuadraticRoots{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a,b,c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		//calculate the quadratic roots
		double[] answer = quadraticRoots(a,b,c);
		
		// print the result and close the scanner object
		if(answer.length == 0 ){
			System.out.println("No real roots");
		}
		else{
			System.out.println("Roots: ");
			for(int i = 0; i<answer.length; i++){	
				System.out.print(answer[i]+" ");
			}
		}
		input.close();
	}
	
	// method to calculate quadratic roots
	public static double[] quadraticRoots(int a, int b, int c){
		double delta = Math.pow(b,2)-(4*a*c);
		if(delta>0){
			double root1 = 0.0, root2 = 0.0;
			root1 = ((-b) + Math.sqrt(delta))/(2*a);
			root2 = ((-b) - Math.sqrt(delta))/(2*a);
			return new double[] {root1,root2};
		}
		else if(delta == 0){
			double root = 0.0;
			root = (-b/(2*a));
			return new double[] {root};
		}
		return new double[]{};
	}
}