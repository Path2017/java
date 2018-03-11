package java0308;

import java.util.Scanner;

public class temperature {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f;
		in = new Scanner(System.in);
		f = in.nextInt();
		System.out.println((int)((f-32)*(5/9.0)));
	}

}
