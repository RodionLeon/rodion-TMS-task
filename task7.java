import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую координату по оси абсцисс");
        x1 = in.nextDouble();
        System.out.println("Введите первую координату по оси ординат");
        y1 = in.nextDouble();
        System.out.println("Введите вторую координату по оси абсцисс");
        x2 = in.nextDouble();
        System.out.println("Введите вторую координату по оси ординат");
        y2 = in.nextDouble();
        System.out.println("Расстояние между точками " + Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
    }}