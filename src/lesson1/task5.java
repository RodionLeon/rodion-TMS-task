package lesson1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int number,first,second,third;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите трёхзначное число");
        number =in.nextInt();
        first = (number - number % 100)/100;
        second = (number /10) %10;
        third = number %10 ;
        System.out.println(third*100+second*10+first);
    }}