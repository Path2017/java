package java0308;

import java.util.Scanner;

public class timecompute {
	public static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time;
		int num;
		in = new Scanner(System.in);
		time = in.nextInt();
		if(time > 800) {
			time = time - 800;
		}else if(time < 800){
			 num = 800 - time;
			 time = 2400 - num;
		}else {
			time = 0;
		}
		System.out.println(time);
	}

}
