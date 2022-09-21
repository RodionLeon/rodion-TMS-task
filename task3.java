import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число >= 100");
        number = in.nextInt();
        while(number < 100){
            System.out.println("Введите число >= 100");
            number = in.nextInt();

        }
        System.out.println((number % 1000 - number %100)/100);
        }



    }
