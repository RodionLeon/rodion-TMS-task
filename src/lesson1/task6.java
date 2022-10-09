package lesson1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int h1,m1,h2,m2;
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите первое время в часах ");
        h1 = in.nextInt();
        System.out.println(" Введите первое время в минутах ");
        m1 = in.nextInt();
        System.out.println(" Введите воторое время в часах ");
        h2 = in.nextInt();
        System.out.println(" Введите второе время в минутах ");
        m2 = in.nextInt();
        System.out.println(" Время в пути " + ((h2 - h1 - 1 )*60 + 60 - m1 + m2) + " минут ");
    }}