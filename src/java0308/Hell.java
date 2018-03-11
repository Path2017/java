package java0308;

import java.util.Scanner;

public class Hell {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		in = new Scanner(System.in);
		System.out.println("请输入尺数：");
		foot = in.nextInt();
		System.out.println("请输入寸数：");
		inch = in.nextDouble();
		System.out.println("身高为(米)：");
		System.out.println((foot+inch/12)*0.3048);
	}

}
