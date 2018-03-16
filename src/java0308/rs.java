package java0308;

import java.util.Scanner;

public class rs{
	public static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rs;
		int r;
		int s;
		String rout = "";
		String sout = "";
		in = new Scanner(System.in);
		rs = in.nextInt();
		r = rs/10;
		s = rs%10;
		if(r == 1) {
			rout = "unreadable.";
		}else if(r == 2) {
			rout = "barely readable, occasional words distinguishable.";
		}else if(r ==3) {
			rout = "readable with considerable difficulty.";
		}else if(r == 4) {
			rout = "readable with practically no difficulty.";
		}else {
			rout = "perfectly readable.";
		}
		if(s == 1) {
			sout = "Faint signals, barely perceptible, ";
		}else if(s == 2) {
			sout = "Very weak signals, ";
		}else if(s == 3) {
			sout = "Weak signals, ";
		}else if(s == 4) {
			sout = "Fair signals, ";
		}else if(s == 5) {
			sout = "Fairly good signals, ";
		}else if(s == 6) {
			sout = "Good signals, ";
		}else if(s == 7) {
			sout = "Moderately strong signals, ";
		}else if(s == 8) {
			sout = "Strong signals, ";
		}else if(s == 9) {
			sout = "Extremely strong signals, ";
		}
		String toput = sout + rout;
		System.out.println(toput);
		
	}

}
