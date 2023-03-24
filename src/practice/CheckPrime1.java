package practice;

import java.util.Scanner;

public class CheckPrime1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println(isPrime(number));

    }
    public static boolean isPrime(int number) {
        int n = 2;
        if(number < 2){
            return false;
        }
        while (n < number){
            if(number % n == 0){
                return false;
            }
            n++;
        }
        return true;
    }
}
