package java0308;

import java.util.Scanner;

public class amount {
	public static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m;
		int sum = 0;
		in = new Scanner(System.in);
		int i =0;
		// 记录当前的素数
		int current = 2;
		n = in.nextInt();
		m = in.nextInt();
		NUM:
		for(int j = 2;;j++) {
			int isPrime = 1;
			for(int k =2;k<j;k++) {
				if(j%k == 0) {
					isPrime = 0;
					break;
				}
			}
			if(isPrime == 1) {
				i = i+1;
				if(i>=n) {
					sum = sum + j;
				}
				System.out.println(j+"当前是个数:"+i+"和为:"+sum);
				if(i == m) {
					break NUM;
				}
			}
		}
				
	}

}
