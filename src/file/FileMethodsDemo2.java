package file;

import java.io.File;
import java.io.IOException;

public class FileMethodsDemo2 {
	public static void main(String[] args) throws IOException {
		// ���ļ������ļ��ӽ��в�����
		File file = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\CallName.java");
		// �����ļ�������ļ������ڣ����� true ����ļ����ڣ��򲻴��� false�� ���·������IOException��
		boolean b1 = file.createNewFile();
		System.out.println("b1=" + b1);
		// -----------ɾ���ļ�����-------ע�⣺��ȥ����վ������------
		//boolean b2 = file.delete();
		//System.out.println("b2=" + b2);

		// -----------��Ҫ�ж��ļ��Ƿ����------------
		boolean b3 = file.exists();
		System.out.println("b3=" + b3);

		// -----------��Ŀ¼���� ������ɾ�����ж�------------
		File dir = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\test");
		// mkdir()��������Ŀ¼��//dir.mkdirs();�����༶Ŀ¼
		boolean b4 = dir.mkdir();
		System.out.println("b4=" + b4);
		// ɾ��Ŀ¼ʱ�����Ŀ¼�������ݣ��޷�ֱ��ɾ����
		//boolean b5 = dir.delete();
		// ֻ�н�Ŀ¼�е����ݶ�ɾ���󣬱�֤��Ŀ¼Ϊ�ա���ʱ���Ŀ¼�ſ���ɾ����
		//System.out.println("b5=" + b5);

		// -----------�ж��ļ���Ŀ¼------------
		File f = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\test");// Ҫ�ж��Ƿ����ļ�����Ŀ¼���������жϴ��ڡ�
		// f.mkdir();//f.createNewFile();
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}
}
