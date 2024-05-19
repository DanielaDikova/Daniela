import java.awt.*;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = Integer.parseInt(scanner.next());
        System.out.print("Input b: ");
        double b = Integer.parseInt(scanner.next());
        System.out.print("Input c: ");
        double c = Integer.parseInt(scanner.next());

        double d = b * b - 4 * a * c;
        System.out.print("D: ");
        System.out.println(d);
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.print("x1: ");
        System.out.println(x1);
        System.out.print("x2: ");
        System.out.println(x2);



    }
}