package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayOfMonth =0 ;
        while(dayOfMonth >=28 && dayOfMonth <=31){
            System.out.println("Введите колличество дней в месяце от 28 до 31 ");
            dayOfMonth = in.nextInt();
        }
        int array[] =  new int[dayOfMonth];
        int sum =0;
        int average_value;
        System.out.println("Введите температуру дня каждого дня в месяце ");
        for (int i = 0; i < array.length-1; i++) {
            array[i]= in.nextInt();
            System.out.println("температура за "+ (i+1) + " день  = " + array[i] + " градусов");
            sum += array[i];

        }
        average_value = sum/ array.length;
        System.out.println("среднее заначение температуры "+ average_value);

    }
}

