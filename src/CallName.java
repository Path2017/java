import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CallName {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		// 存储学生信息
		addStudent(list);
		// 打印每个学生的信息
		printStudent(list);
		// 随机点名
		randomStudent(list);
	}
	
	
	public static void addStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<3;i++) {
			Student s = new Student();
			System.out.println("存储第"+i+"个学生的姓名：");
			String name = sc.next();
			s.setName(name);
			System.out.println("存储第"+i+"个学生的年龄：");
			int age = sc.nextInt();
			s.setAge(age);
			list.add(s);
		}
	}
	
	public static void printStudent(ArrayList<Student> list) {
		for(int i = 0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.println("姓名："+s.getName()+"，年龄："+s.getAge());
		}
	}
	
	public static void randomStudent(ArrayList<Student> list) {
		int index = new Random().nextInt(list.size());
		Student s = list.get(index);
		System.out.println("被随机点名的学生："+s.getName()+"，年龄："+s.getAge());
	}
}
