package java0308;
import java.util.Scanner;

public class Average {
	private static Scanner sc;

	public static void main(String[] args) {
		int[] numbers = new int[100];
		int x;
		int cnn = 0;
		int sum = 0;
		sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		x = sc.nextInt();
		while(x>-1) {
			numbers[cnn] = x;
			cnn ++;
			System.out.println("请输入数字：");
			x = sc.nextInt();
		}
		for(int j=0;j<cnn;j++) {
			sum += numbers[j];
			System.out.println("序号为"+j+"为："+numbers[j]);
		}
		System.out.println("所有数字和为："+sum);
	}
}
