package file;

import java.io.File;

public class FileMethodDemo3 {
	public static void main(String[] args) {
		File dir = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src");
		// ��ȡ����Ŀ¼�µĵ�ǰ���ļ��Լ��ļ��е����ơ�
		String[] names = dir.list();
		for (String name : names) {
			System.out.println(name);
		}
		// ��ȡĿ¼�µ�ǰ�ļ��Լ��ļ�����ֻҪ�õ����ļ�������ô�Ϳ��Ի�ȡ������Ҫ����Ϣ
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file);
		}

	}
}
