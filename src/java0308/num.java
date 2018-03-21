package java0308;

import java.util.Scanner;

public class num {
	public static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int num1 = 0;
		int num2 = 0;
		in = new Scanner(System.in);
		num = in.nextInt();
		while(!(num == -1)) {
			if(num%2 == 0) {
				num2 = num2 +1;
			}else {
				num1 = num1 +1;
			}
			num = in.nextInt();
		}
		System.out.println(num1+" "+num2);
	}
}
