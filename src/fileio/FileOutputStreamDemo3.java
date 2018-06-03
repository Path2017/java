package fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\output.txt");
		// 定义FileOutputStream的引用
		FileOutputStream fos = null;
		try {
			// 创建FileOutputStream对象
			fos = new FileOutputStream(file,true);
			// 写出数据
			fos.write("abcde".getBytes());
		} catch (IOException e) {
			System.out.println(e.toString() + "----");
		} finally {
			// 一定要判断fos是否为null，只有不为null时，才可以关闭资源
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					throw new RuntimeException("");
				}
			}
		}
	}

}
