package test;

public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20){

            number++;

            if(number == 10 || number == 11){
                continue;
            }

            sum += number;

        }


        System.out.println("The is number :" + number);
        System.out.println("The is sum :"+ sum);
    }
}
