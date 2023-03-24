package exercise;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu
                0.exit.
                1.Rectangle.
                2.Triangle.
                3.Triangle2.
              
                """);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                for (int i = 1 ; i <= 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
            case 3 -> {
                for (int i = 5 ; i >= 1; i--) {
                    for (int j = 0; j < i; j++){
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
            default -> System.out.println("Please re-enter");
        }
    }
}
