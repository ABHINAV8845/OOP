package basicprograms;
import java.util.Scanner;
public class Positivenegitivezero {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>0) {
			System.out.println("positive");
		}
		else if(n<0) {
			System.out.println("negtive");
		}
		else {
			System.out.println("zero");
		}
		s.close();
	}

}
