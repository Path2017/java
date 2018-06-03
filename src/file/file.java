package file;

import java.io.File;

public class file {
	public static void main(String[] args) {
		// File构造函数演示
		String pathName = "C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\CallName.java";
		File f1 = new File(pathName);// 将Test22文件封装成File对象。注意；有可以封装不存在文件或者文件夹，变成对象。
		System.out.println(f1);

		File f2 = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src", "CallName.java");
		System.out.println(f2);

		// 将parent封装成file对象。
		File dir = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src");
		File f3 = new File(dir, "CallName.java");
		System.out.println(f3);

	}
}
