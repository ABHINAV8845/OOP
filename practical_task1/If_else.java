package practical_task1;
import java.util.Scanner;
public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.print("enter your age:");
		int age =sc.nextInt();
		if(age >= 18) {
			System.out.print("eligibility for applying driving license");
		}
		else {
			System.out.print("NO eligibility for applying driving license");
		}
		sc.close();
	}

}
