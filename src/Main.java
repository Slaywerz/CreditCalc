import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите желаемую сумму кредитования: ");
        int creditAmount = in.nextInt();
        while (100_000 > creditAmount || 5_000_000 < creditAmount) {
            System.out.println("Сумма кредитования составляет от 100 000 до 5 000 000 рублей.");
            System.out.print("Введите желаемую сумму кредитования: ");
            creditAmount = in.nextInt();
        }

        int creditTerm;
        System.out.print("Введите срок желаемого кредитования: ");
        creditTerm = in.nextInt();
        while (1 > creditTerm || 3 < creditTerm) {
            System.out.println("Срок кредитования может составлять от 1 года до 3 лет");
            System.out.print("Введите срок желаемого кредитования: ");
            creditTerm = in.nextInt();
        }
        int monthlyPayment = service.calculate(creditAmount, creditTerm);
        System.out.println("Ваш ежемесячный платеж будет составлять: " + monthlyPayment + " рублей.");
//        System.out.println("Ваша процентная ставка: " + interestRate + " %.");
    }
}