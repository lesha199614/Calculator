import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи первое число");
        double a = sc.nextDouble();
        System.out.println("Введи второе число");
        double b = sc.nextDouble();
        Calculator result = new Calculator(a, b);
        result.sum();
        result.differnce();
        result.multiplicate();
        result.division();

    }
}
