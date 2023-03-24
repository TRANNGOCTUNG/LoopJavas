package practice;

import java.util.Scanner;

public class WishOfANumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a");
        int a = scanner.nextInt();
        System.out.println("Nhập b");
        int b = scanner.nextInt();

        while (a != b) {
            if(a > b){
               a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor :  = " + a);
    }
}
