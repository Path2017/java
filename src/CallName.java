import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CallName {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		// �洢ѧ����Ϣ
		addStudent(list);
		// ��ӡÿ��ѧ������Ϣ
		printStudent(list);
		// �������
		randomStudent(list);
	}
	
	
	public static void addStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<3;i++) {
			Student s = new Student();
			System.out.println("�洢��"+i+"��ѧ����������");
			String name = sc.next();
			s.setName(name);
			System.out.println("�洢��"+i+"��ѧ�������䣺");
			int age = sc.nextInt();
			s.setAge(age);
			list.add(s);
		}
	}
	
	public static void printStudent(ArrayList<Student> list) {
		for(int i = 0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.println("������"+s.getName()+"�����䣺"+s.getAge());
		}
	}
	
	public static void randomStudent(ArrayList<Student> list) {
		int index = new Random().nextInt(list.size());
		Student s = list.get(index);
		System.out.println("�����������ѧ����"+s.getName()+"�����䣺"+s.getAge());
	}
}
