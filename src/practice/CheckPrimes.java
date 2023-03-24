package practice;

import javax.swing.*;
import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of primes: ");
        int number = scanner.nextInt();
        System.out.println(checkPrimes(number) + "Number is prime");

    }
    public static boolean checkPrimes(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
