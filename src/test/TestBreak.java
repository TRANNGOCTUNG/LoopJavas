package test;

public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20){
            sum += number;
            if (sum >= 100){
               break;
            }
            number ++;
        }
        System.out.println("The is number : " + number);
        System.out.println("The is sum : "+ sum);
    }
}
