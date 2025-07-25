package practical_task1;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number (1 are 2): ");
		        int choice = sc.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.println("You chose One");
		                break;
		            case 2:
		                System.out.println("You chose Two");
		                break;
		            default:
		                System.out.println("Invalid choice");
		        }

		        sc.close();
		    }
		}