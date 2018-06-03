package fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\output.txt");
		// ����FileOutputStream������
		FileOutputStream fos = null;
		try {
			// ����FileOutputStream����
			fos = new FileOutputStream(file,true);
			// д������
			fos.write("abcde".getBytes());
		} catch (IOException e) {
			System.out.println(e.toString() + "----");
		} finally {
			// һ��Ҫ�ж�fos�Ƿ�Ϊnull��ֻ�в�Ϊnullʱ���ſ��Թر���Դ
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
