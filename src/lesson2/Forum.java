package lesson2;

import java.util.Scanner;


public class Forum {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i]; // 4
            int j = i - 1; // 1
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;

            }
            array[j + 1] = current;
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countOfRating;
        int temp;
        int  indxOfSecondMinRating =0 ;
        int sum = 0;
        System.out.println("Введите колличество оценок ");
        countOfRating = in.nextInt();
        if (countOfRating >= 100 && countOfRating <= 1) {

            System.out.println("Введите колличество оценок ");
            countOfRating = in.nextInt();
        }
        int[] arrOfRating = new int[countOfRating];

        for (int i = 0; i <= arrOfRating.length-1; i++) {
            System.out.println("Введите оценку ");
            temp = in.nextInt();
            if (temp >= 0 && temp <= 10) {
                arrOfRating[i] = temp;
                sum += arrOfRating[i];
            }
        }
        arrOfRating = insertionSort(arrOfRating);
        for (int j = 1; j < arrOfRating.length - 1; j++) {
            if (arrOfRating[j] - arrOfRating[0] >= 3) {
                indxOfSecondMinRating = j;
                j= arrOfRating.length;
            }
        }
        for (int n = 0; n <= indxOfSecondMinRating -1 ; n++) {
            arrOfRating[n] = sum/ arrOfRating.length;
        }


        for (int m = 0; m <= arrOfRating.length - 1; m++) {
            System.out.println(arrOfRating[m]);

        }
    }
}

