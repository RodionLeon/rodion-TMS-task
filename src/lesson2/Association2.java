package lesson2;

import java.util.Scanner;
public class Association2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] firstArray = {0, 2, 4, 6};
        int[] secondArray = {1, 3, 5, 7};
        int[] associationArray = new int[firstArray.length + secondArray.length];
        int temp1 = 0;
        int temp2 = 0;
        int i = 0;
        while(temp1 + temp2 != associationArray.length){
            if (temp1 == firstArray.length){
                associationArray[i] = secondArray[temp2];
                temp2++;
                i++;
            }
            else if(temp2 != secondArray.length && (firstArray[temp1] >= secondArray[temp2])  ){
                associationArray[i] =secondArray[temp2];
                temp2++;
                i++;
            }
           else if(temp1 != firstArray.length && (temp2 == secondArray.length)){
                associationArray[i] =firstArray[temp1];
                temp1++;
                i++;
            }
            else if( temp1 != firstArray.length && (secondArray[temp2] > firstArray[temp1]) ){
                associationArray[i] =firstArray[temp1];
                temp1 ++ ;
                i++;
            }


        }
        for (int j = 0; j <= associationArray.length-1 ; j++) {
            System.out.println(associationArray[j]);
        }
    }

}