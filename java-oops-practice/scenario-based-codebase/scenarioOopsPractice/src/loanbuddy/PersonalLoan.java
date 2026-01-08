package loanbuddy;
class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 13.5); // Higher interest
    }

    @Override
    public double calculateEMI() {
        return calculateEMIFormula(interestRate);
    }
}
