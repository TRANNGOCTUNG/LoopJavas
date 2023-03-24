package practice;

import java.util.Scanner;

public class CheckPrime100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++){
            if(isPrime(i)) {
                System.out.println(i + "is prime ");
            }
        }
    }
    public static boolean isPrime(int n ){
        if(n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
