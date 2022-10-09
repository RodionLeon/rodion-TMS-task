package lesson1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        long number;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        number =in.nextInt();
        if(number %2 == 1)

            System.out.println(" Число " + number + " нечетное ");

        else

            System.out.println(" Число " + number + " четное ");


    }}