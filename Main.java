public class Main {

    public static void main(String[] args) {
        CreditPaymentService cps = new CreditPaymentService();

        double monthlyPayment1 = cps.calculateMonthlyPayment(1000000, 0.0999, 1);
        System.out.println("Ежемесячный платёж со сроком 1 год: " + (int) monthlyPayment1);

        double monthlyPayment2 = cps.calculateMonthlyPayment(1000000, 0.0999, 2);
        System.out.println("Ежемесячный платёж со сроком 1 год: " + (int) monthlyPayment2);

        double monthlyPayment3 = cps.calculateMonthlyPayment(1000000, 0.0999, 3);
        System.out.println("Ежемесячный платёж со сроком 1 год: " + (int) monthlyPayment3);
    }
}