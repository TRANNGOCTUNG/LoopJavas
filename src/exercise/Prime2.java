package exercise;

public class Prime2 {
    public static void main(String[] args) {
        int number = 100;
        int status = 1;

        System.out.println("Các số nguyên tố nhỏ hơn 100");
        System.out.println(2 + " is prime");

        for (int i = 2; i < number;){
            for (int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    status = 0;
                    break;
                }
            }
            if(status != 0){
                System.out.println(i + " is prime");
            }
            status = 1;
            i++;
        }
    }
}
