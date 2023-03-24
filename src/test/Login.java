package test;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        String LoginName;
        do {
            System.out.println("Enter password:");
            LoginName = login.nextLine();
        } while (!LoginName.equals("hello"));
        System.out.println(LoginName);
    }
}
