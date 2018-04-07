package java0308;

import java.util.Scanner;

public class factor {
	public static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int amount = 1;
		for(int i =1;i<=n;i++) {
			amount *= i;
		}
		System.out.println(amount);
	}

}
