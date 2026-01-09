import java.util.Scanner;
public class TwoSum{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// take user input 
		System.out.println("Enter the size of array: ");
		int size = scanner.nextInt();
		System.out.println("Enter the numbers in an array: ");
		int []number = new int[size];
		for(int i=0; i<number.length; i++){
			number[i] = scanner.nextInt();
		}
		System.out.println("Enter the target sum : ");
		int target = scanner.nextInt();
		
		// applying the logic
		int [] targetSum = twoSum(number, target);
		
		// print the result
		System.out.println("The two numbers whose sum is equal to target number is : " + targetSum[0] + " and " + targetSum[1]);	
	}
	
    public static int[] twoSum(int[] nums, int target) 
    {
        int n = nums.length;
       int start = 0;
       int end = 0;
       for(int i=0;i<n;i++)
	   {
		for(int j=1;j<n;j++)
		{
            if(nums[i]+nums[j]==target && i!=j)
			{
                start = i;
                System.out.println(i);
                end = j;
                System.out.println(j);
            }
        }
       }
      return new int[]{end , start};
    }
}