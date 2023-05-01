public class CreditPaymentService {

    public double calculateMonthlyPayment(double creditAmount, double interestRate, int creditTerm) {

        double monthlyInterestRate = interestRate / 12;
        int loanTermInMonths = creditTerm * 12;
        double monthlyPayment = creditAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -loanTermInMonths));

        return Math.round(monthlyPayment * 100.0) / 100.0;
    }
}
