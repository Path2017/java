package javapjt;

import java.util.Scanner;
import java.util.ArrayList;

public class market {
	public static void main(String[] args) {
		System.out.println("--- 系统启动开始 ---");

		ArrayList<FruitItem> list = new ArrayList<FruitItem>();

		// 商品初始化
		init(list);
		while (true) {
			// 打印菜单;
			mainmenu();
			// 功能选择
			chooseFun(list);
		}
	}

	// 商品初始化
	public static void init(ArrayList<FruitItem> list) {
		FruitItem item = new FruitItem();
		item.name = "苹果";
		item.ID = 001;
		item.price = 5;

		FruitItem item1 = new FruitItem();
		item1.name = "香蕉";
		item1.ID = 002;
		item1.price = 4.2;

		FruitItem item2 = new FruitItem();
		item2.name = "梨";
		item2.ID = 003;
		item2.price = 6.4;

		list.add(item);
		list.add(item1);
		list.add(item2);
	}

	// 打印菜单
	public static void mainmenu() {
		System.out.println("==== 欢迎光临超市  ====");
		System.out.println("1:查询货物  2：添加新货物 3:删除货物 4：修改货物");
		System.out.println("5：退出系统");
	}

	// 功能选择
	public static void chooseFun(ArrayList<FruitItem> list) {
		System.out.println("输入您选择的功能");
		Scanner sc = new Scanner(System.in);
		String choose = sc.next();
		switch (choose) {
		case "1": // 库存查询
			showList(list);
			break;
		case "2": // 添加库存
			addList(list);
			break;
		case "3": // 删除商品
			delList(list);
			break;
		case "4": // 修改商品
			editList(list);
			break;
		case "5": // 退出系统
			System.out.println("退出系统");
			return;
		default:
			System.out.println("对不起，没有您输入的功能，请重新选择");
			break;
		}
	}

	// 库存遍历
	public static void showList(ArrayList<FruitItem> list) {
		System.out.println("=======================商品库存清单=======================");
		System.out.println("商品编号\t商品名称\t\t商品单价");
		for (int i = 0; i < list.size(); i++) {
			FruitItem item = list.get(i);
			System.out.println(item.ID + "\t" + item.name + "\t" + item.price);
		}
	}

	// 添加库存
	public static void addList(ArrayList<FruitItem> list) {
		FruitItem item = new FruitItem();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入商品编号：");
		item.ID = sc.nextInt();
		System.out.println("输入商品名称：");
		item.name = sc.next();
		System.out.println("输入商品价格：");
		item.price = sc.nextDouble();
		list.add(item);
	}

	// 删除商品
	public static void delList(ArrayList<FruitItem> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入需要删除的商品编号：");
		int num = sc.nextInt();
		// 删除集合元素
		for (int i = 0; i < list.size(); i++) {
			FruitItem thisItem = list.get(i);
			if (thisItem.ID == num) {
				list.remove(thisItem);
				System.out.println("商品删除完毕!");
				return;
			}
		}
		System.out.println("对不起，没有这个编号的商品!");
	}

	// 修改商品
	public static void editList(ArrayList<FruitItem> list) {
		System.out.println("输入需要修改的商品编号：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 更新集合元素
		for (int i = 0; i < list.size(); i++) {

			FruitItem thisItem = list.get(i);
			if (thisItem.ID == num) {
				System.out.print("请输入新的商品ID:");
				thisItem.ID = sc.nextInt();
				System.out.print("请输入新的商品名称:");
				thisItem.name = sc.next();
				System.out.print("请输入新的商品单价:");
				thisItem.price = sc.nextDouble();
				System.out.println("商品信息更新完毕!");
				return;
			}
		}
		System.out.println("对不起，没有这个编号的商品!");

	}

}
