package file;

import java.io.File;

public class file {
	public static void main(String[] args) {
		// File���캯����ʾ
		String pathName = "C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\CallName.java";
		File f1 = new File(pathName);// ��Test22�ļ���װ��File����ע�⣻�п��Է�װ�������ļ������ļ��У���ɶ���
		System.out.println(f1);

		File f2 = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src", "CallName.java");
		System.out.println(f2);

		// ��parent��װ��file����
		File dir = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src");
		File f3 = new File(dir, "CallName.java");
		System.out.println(f3);

	}
}
