package fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// ���󣺽�����д�뵽�ļ��С�
		// �����洢���ݵ��ļ���
		File file = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\output.txt");
		// ����һ�����ڲ����ļ����ֽ����������һ�����ͱ�����ȷ���ݴ洢Ŀ�ĵء�
		// �����Ŀ�����ļ������Զ�����������ļ����ڣ��򸲸ǡ�
		FileOutputStream fos = new FileOutputStream(file);
		// ���ø����е�write������
		byte[] data = "abcde".getBytes();
		fos.write(data);
		// �ر�����Դ��
		fos.close();
	}

}
