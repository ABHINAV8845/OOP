package practical_task1;
import java.util.Scanner;
public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();  
		        int original = num;
		        int reversed = 0;

		        while (num != 0) {
		            int d = num % 10;        
		            reversed = reversed * 10 + d;
		            num = num / 10;              
		        }

		        if (original == reversed) {
		            System.out.println(original +"is Palindrome.");
		        } else {
		            System.out.println(original + " is NOT a Palindrome.");
		        }

		        sc.close();
		    }
		}