package java0308;

import java.util.Scanner;

public class Hell {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		in = new Scanner(System.in);
		System.out.println("�����������");
		foot = in.nextInt();
		System.out.println("�����������");
		inch = in.nextDouble();
		System.out.println("���Ϊ(��)��");
		System.out.println((foot+inch/12)*0.3048);
	}

}
