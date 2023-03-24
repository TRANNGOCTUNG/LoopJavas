package test;

import java.util.Scanner;

public class Login1 {
    public static void main(String[] args) {
        Scanner Login = new Scanner(System.in);

        System.out.println("""
                Menu
                1.Hello;
                2.Hi;
                3.Reset;
                """);
        System.out.println("Enter username : ");
        String Name = Login.nextLine();

        switch (Name){
            case "Hello" -> System.out.println("Yes");
            case "Hi" -> System.out.println("No");
            default -> System.out.println("Hello World");
        }

    }
}
