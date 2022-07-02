package Java;

import java.util.Scanner;

public class swapwithoutthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,x;
		Scanner scan=new Scanner(System.in);
		i=scan.nextInt();
		x=scan.nextInt();
		System.out.println("Before swapping" + i + x);
		i=i+x;
		x=i-x;
		i=i-x;
		System.out.println("AFter SWAPPING"+ i + x);

	}

}
