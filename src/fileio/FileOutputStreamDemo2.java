package fileio;

import java.io.File;
import java.io.FileOutputStream;
//ֱ��new FileOutputStream(file)������������д�����ݣ��Ḳ��ԭ�е��ļ�����ô��������ԭ�е��ļ�����д������ô���أ�
//��������FileOutputStream��API��������FileOutputStream�Ĺ��캯���У����Խ���һ��boolean���͵�ֵ�����ֵtrue���ͻ����ļ�ĩλ������ӡ�

public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\output1.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		String str = "\r\n" + "��д";
		fos.write(str.getBytes());
		fos.close();
	}

}
