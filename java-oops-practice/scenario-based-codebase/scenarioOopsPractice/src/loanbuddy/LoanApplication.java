package loanbuddy;

abstract class LoanApplication implements IApprovable {
    protected Applicant applicant;
    protected int term; 
    protected double interestRate;
    private String loanStatus = "PENDING"; 

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() > 20000) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    protected double calculateEMIFormula(double rate) {
        double P = applicant.getLoanAmount();
        double R = rate / (12 * 100);
        int N = term;
        
        return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
    }
}
