package practice;

import java.util.Scanner;

public class WishOfANumber {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        for (int i = 1; i <= number ; i++) {
            if(number % i == 0){
                System.out.println(i + " WishOfANumber " + number);
            }
        }
    }
}
