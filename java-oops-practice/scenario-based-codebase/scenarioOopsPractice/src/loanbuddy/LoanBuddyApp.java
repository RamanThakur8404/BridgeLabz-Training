package loanbuddy;
import java.util.Scanner;

public class LoanBuddyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Loan Term (months): ");
        int term = sc.nextInt();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        System.out.println("\nChoose Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.println("3. Personal Loan");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        LoanApplication loan = null;

        switch (choice) {
            case 1:
                loan = new HomeLoan(applicant, term);
                break;

            case 2:
                loan = new AutoLoan(applicant, term);
                break;

            case 3:
                loan = new PersonalLoan(applicant, term);
                break;

            default:
                System.out.println("Invalid Loan Type");
                sc.close();
                return;
        }

        if (loan.approveLoan()) {
            System.out.println("Loan Approved");
            System.out.println("EMI: " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected");
        }

        System.out.println("Loan Status: " + loan.getLoanStatus());
        sc.close();
    }
}
