package loanbuddy;
class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5); // Home loan interest
    }

    @Override
    public double calculateEMI() {
        return calculateEMIFormula(interestRate);
    }
}
