package practice;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu
                1.Draw the triangle.
                2.Draw the square.
                3.Draw the rectangle.
                0.Exit.
                """);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.close();



        switch (number) {
            case 1 -> {
                for(int i = 1; i <= 3 ; i++) {
                    for (int j = 1; j <= i ; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                for(int i = 1; i <= 3 ; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
            case 3 -> {
                for (int i = 1; i <= 5 ; i++) {
                    for (int j = 0; j <5 ; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
            case 0 -> System.exit(0);
            default -> System.out.println("Please re-enter");
        }
    }
}
