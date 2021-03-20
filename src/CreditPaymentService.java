import java.util.Scanner;

public class CreditPaymentService {
    public int calculate(int creditAmount, int creditTerm) {
        Scanner in = new Scanner(System.in);

        int termInMonth = creditTerm * 12;
        double interestRate = 9.99;
        double ratePerMonth = interestRate / 100 / 12;
        double x = Math.pow(1 + ratePerMonth, termInMonth); // variable to reducing formula.
        int monthlyPayment = (int) (creditAmount * ((ratePerMonth * x) / (x - 1)));

        return monthlyPayment;
    }
}
