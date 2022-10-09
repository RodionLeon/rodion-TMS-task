package lesson1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int hours,minutes,second;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во часов");
        hours = in.nextInt();
        System.out.println("Введите кол-во минут");
        minutes = in.nextInt();
        System.out.println("Введите кол-во секунд");
        second =in.nextInt();
        System.out.println("время прошедшее с начала суток" +" "+ ((hours*60*60)+(minutes*60)+second));

        }



    }
