package practical_task1;
import java.util.Scanner;

public class Do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int i = 1;

        System.out.print("Enter a number to print its table: ");
        number = sc.nextInt();

        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }
}

