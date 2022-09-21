import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int deegree,minutes,second;
        double Pi = 3.1415926535;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во  градусов");
        deegree = in.nextInt();
        System.out.println("Введите кол-во минут");
        minutes = in.nextInt();
        System.out.println("Введите кол-во секунд");
        second =in.nextInt();
        System.out.println("угл в радианах" +" "+ ((deegree+(0.0166667*minutes)+(0.000277778*second))*Pi/180));

    }}
