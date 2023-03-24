package test;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("\t  Multiplication");

        for(int i = 1; i <= 9; i++){
            System.out.print(" " + i);
        }
        System.out.println( "\n________________________________________________________________");

        for(int i = 1; i <= 9; i ++){
            System.out.print( i + " | ");

            for (int j = 1; j <= 9; j++){
//                System.out.print( i * j + " " );
                System.out.printf("%5d",j * i);
            }
            System.out.print(" ; ");

            System.out.println();

        }

    }
}
