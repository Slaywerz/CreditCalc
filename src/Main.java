import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        Scanner in = new Scanner(System.in);


//        System.out.print("Введите желаемую сумму кредитования: ");
//        int creditAmount = in.nextInt();
        int creditTerm;
        do {
            System.out.print("Введите срок желаемого кредитования: ");
            creditTerm = in.nextInt();
        }
        while (3 < creditTerm);
        System.out.println(creditTerm);

//        boolean b= 3 < creditTerm;
//        if (b) {
//            System.out.println("Срок кредитования составляет от 1 года до 3 лет.");
        }
    }