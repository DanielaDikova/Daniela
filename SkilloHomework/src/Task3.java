import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int area = b / 2 * h;

        System.out.println(area);


    }
}
