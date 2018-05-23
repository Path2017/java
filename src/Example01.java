
public class Example01 {
	public static void main(String[] args) {
		Developer d = new Developer(); // 创建一个研发部员工类对象
		d.name = "小明"; // 为该员工类的name属性进行赋值
		d.printName(); // 调用该员工的printName()方法
		d.work(); // 调用Developer类继承来的work()方法
	}
}
