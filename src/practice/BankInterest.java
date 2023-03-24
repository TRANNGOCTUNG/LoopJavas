package practice;

import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        float interestRate;
        int month;
        double totalInterestRate = 0;

        System.out.println("Nhập số tiền gửi:");
        money = scanner.nextDouble();
        System.out.println("Nhập số tiền lãi");
        interestRate = scanner.nextFloat();
        System.out.println("Nhập số tháng");
        month = scanner.nextInt();
        scanner.close();

        totalInterestRate = (float)  (money * (interestRate / 100) / 12 * month);
        System.out.println(totalInterestRate + " đ ");
        double totalInterestRates = 0;

        for (int i = 1; i <= month ; i++) {
            totalInterestRates += (float)  money * ( interestRate / 100) / 12 * month;
        }
        System.out.println(totalInterestRates);

    }
}
