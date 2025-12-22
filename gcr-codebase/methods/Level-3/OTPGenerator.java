import java.util.Scanner;
import java.util.Arrays;
public class OTPGenerator{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = scanner.nextInt();
		
		// Applying the 
		int []otp = generateRandomOTP(size);
		printGeneratedOTP(otp);
		boolean checkUnique = areOTPUnique(otp);
		if(checkUnique){
			System.out.println("All OTP are unique");
		}
		else{
			System.out.println("All OTP are not unique");
		}

		//close the input object
		scanner.close();
	}

	// print the generated OTP
	public static void printGeneratedOTP(int []otp){
		System.out.println(Arrays.toString(otp));
	}

	// generate OTP
	public static int []generateRandomOTP(int size){
		System.out.println("Generated Random OTP are: ");
		int []otp = new int[size];
		for(int i=0; i<size; i++){
			otp[i] = (int)(Math.random()*900000) + 100000;
		}
		return otp;
	}
	
	// check all random generated values are unique
	public static boolean areOTPUnique(int []otp){
		for(int i=0; i<otp.length; i++){
			for(int j=1; j<otp.length; j++){
				if(otp[i]==otp[j]){
					return false;
				}
			}
		}
		return true;
	}	
}	
		
		
		