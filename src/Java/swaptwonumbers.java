package Java;

import java.util.Scanner;

public class swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,y,temp;
		Scanner cla=new Scanner(System.in);
		i=cla.nextInt();
		y=cla.nextInt();
		System.out.println("before swapping:"+ i + y);
		temp=i;
		i=y;
		y=temp;
		System.out.println("after swapping"+ i+y);
		

	}

}
