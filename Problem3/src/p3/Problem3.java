package p3;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// While Loop with input; sum with while loop?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for multiplication table");
		int number = sc.nextInt();
		int x =  1;
		while(x<=10) {
		System.out.printf("%d * %d = %d \n",number, x, number*x);
		x++;
		
		}

	}

}
