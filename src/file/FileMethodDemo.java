package file;

import java.io.File;

public class FileMethodDemo {
	public static void main(String[] args) {
		// �����ļ�����
		File file = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\CallName.java");
		// ��ȡ�ļ��ľ���·������ȫ·��
		String absPath = file.getAbsolutePath();
		// File�з�װ��·����ʲô��ȡ���ľ���ʲô��
		String path = file.getPath();
		// ��ȡ�ļ�����
		String filename = file.getName();
		// ��ȡ�ļ���С
		long size = file.length();

		System.out.println("absPath=" + absPath);
		System.out.println("path=" + path);
		System.out.println("filename=" + filename);
		System.out.println("size=" + size);
	}

}
