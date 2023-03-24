package exercise;

import java.util.Scanner;

public class PrimeN {
    public static void main(String[] args) {
       int n;
       int status = 1;
       int number = 3;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n is prime");
        n = scanner.nextInt();

        System.out.println(n + " is prime");
        System.out.println(2 + " is prime");

        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(number) ; j++) {
                if(number % j == 0) {
                    status = 0;
                    break;
                }
            }
            if(status != 0) {
                System.out.println(number + " is prime");
                i++;
            }
            status = 1;
            number++;
        }
    }
}
