import java.util.Scanner;
public class ZaraBonus {
    public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
		double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;
		// input using loop
        for (int index = 0; index < 10; index++) {
            System.out.println("Enter salary for employee " + (index + 1));
            salary[index] = read.nextDouble();

            System.out.println("Enter years of service for employee " + (index + 1));
            years[index] = read.nextDouble();

            if (salary[index] <= 0 || years[index] < 0) {
                System.out.println("Invalid input. Please enter again.");
                index--;
            }
        }

        // Calculation of bonus, salary and new salary
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5){
                bonus[i] = (salary[i] * 5) / 100;
            }
			else{
                bonus[i] = (salary[i] * 2) / 100;
			}
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

		//print the required output and close scanner object
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
        read.close();
    }
}