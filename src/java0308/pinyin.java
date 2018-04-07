package java0308;

import java.util.Scanner;

public class pinyin {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		int num = in.nextInt();
		int value = num;
		
		String sum ="";
		String residue = "";
		if(num < 0) {
			sum = "fu";
			num = num *(-1);
		}
		if(num == 0) {
			sum = "ling";
		}
		while(num > 0) {
			int arr = num%10;
			switch(arr){
				case 0:
					{
						residue = "ling" + residue; 
						break;
					}
				case 1:{
						residue = "yi" + residue;
						break;
					}
				case 2:{
						residue = "er" + residue;
						break;
					}
				case 3:{
						residue = "san" + residue;
						break;
					}
				case 4:{
						residue = "si" + residue;
						break;
					}
				case 5:{
						residue = "wu" + residue;
						break;
					}
				case 6:{
						residue = "liu" + residue;
						break;
					}
				case 7:{
						residue = "qi" + residue;
						break;
					}
				case 8:{
						residue = "ba" + residue;
						break;
					}
				case 9:{
						residue = "jiu" + residue;
						break;
					}
				}
			if((value <0)||(value >0&&num>=10)) {
				residue = " "+residue;
			}
			num = num/10;
		}
		sum = sum + residue;
		System.out.println(sum);
	}
}
