package loanbuddy;
class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.5); // Auto loan interest
    }

    @Override
    public double calculateEMI() {
        return calculateEMIFormula(interestRate);
    }
}
