package basicprograms;
import java.util.Scanner;
public class Oddandeven {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		s.close();
	}

}
