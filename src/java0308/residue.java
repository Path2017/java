package java0308;

import java.util.Scanner;

public class residue {

	private static Scanner in;

	public static void main(String[] args) {
		int numinput; // ����10ʣ����
		int numoutput = 0;
		int flag; // ����
		int tag = 0; // ��¼��ǰ
		int arr = 1; // ��¼2���Ʊ���
		in = new Scanner(System.in);
		numinput = in.nextInt();
		while(numinput>0) {
			flag = numinput%10;
			numinput = numinput/10;
			tag = tag +1;
			if(flag%2 == tag%2) {
				numoutput = numoutput + arr;
			}
			arr = arr*2; 
		}
		System.out.println(numoutput);
	}
}
