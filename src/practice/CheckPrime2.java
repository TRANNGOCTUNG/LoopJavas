package practice;

import java.util.Scanner;

public class CheckPrime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        checkPrime(number);
    }
    public static void checkPrime(int n){
        boolean checkPrimes = true;
        if( n < 2){
            checkPrimes = false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i  == 0){
                checkPrimes = false;
                break;
            }
        }
        if(checkPrimes){
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
