package javapjt;

import java.util.Scanner;
import java.util.ArrayList;

public class market {
	public static void main(String[] args) {
		System.out.println("--- ϵͳ������ʼ ---");

		ArrayList<FruitItem> list = new ArrayList<FruitItem>();

		// ��Ʒ��ʼ��
		init(list);
		while (true) {
			// ��ӡ�˵�;
			mainmenu();
			// ����ѡ��
			chooseFun(list);
		}
	}

	// ��Ʒ��ʼ��
	public static void init(ArrayList<FruitItem> list) {
		FruitItem item = new FruitItem();
		item.name = "ƻ��";
		item.ID = 001;
		item.price = 5;

		FruitItem item1 = new FruitItem();
		item1.name = "�㽶";
		item1.ID = 002;
		item1.price = 4.2;

		FruitItem item2 = new FruitItem();
		item2.name = "��";
		item2.ID = 003;
		item2.price = 6.4;

		list.add(item);
		list.add(item1);
		list.add(item2);
	}

	// ��ӡ�˵�
	public static void mainmenu() {
		System.out.println("==== ��ӭ���ٳ���  ====");
		System.out.println("1:��ѯ����  2������»��� 3:ɾ������ 4���޸Ļ���");
		System.out.println("5���˳�ϵͳ");
	}

	// ����ѡ��
	public static void chooseFun(ArrayList<FruitItem> list) {
		System.out.println("������ѡ��Ĺ���");
		Scanner sc = new Scanner(System.in);
		String choose = sc.next();
		switch (choose) {
		case "1": // ����ѯ
			showList(list);
			break;
		case "2": // ��ӿ��
			addList(list);
			break;
		case "3": // ɾ����Ʒ
			delList(list);
			break;
		case "4": // �޸���Ʒ
			editList(list);
			break;
		case "5": // �˳�ϵͳ
			System.out.println("�˳�ϵͳ");
			return;
		default:
			System.out.println("�Բ���û��������Ĺ��ܣ�������ѡ��");
			break;
		}
	}

	// ������
	public static void showList(ArrayList<FruitItem> list) {
		System.out.println("=======================��Ʒ����嵥=======================");
		System.out.println("��Ʒ���\t��Ʒ����\t\t��Ʒ����");
		for (int i = 0; i < list.size(); i++) {
			FruitItem item = list.get(i);
			System.out.println(item.ID + "\t" + item.name + "\t" + item.price);
		}
	}

	// ��ӿ��
	public static void addList(ArrayList<FruitItem> list) {
		FruitItem item = new FruitItem();
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ʒ��ţ�");
		item.ID = sc.nextInt();
		System.out.println("������Ʒ���ƣ�");
		item.name = sc.next();
		System.out.println("������Ʒ�۸�");
		item.price = sc.nextDouble();
		list.add(item);
	}

	// ɾ����Ʒ
	public static void delList(ArrayList<FruitItem> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫɾ������Ʒ��ţ�");
		int num = sc.nextInt();
		// ɾ������Ԫ��
		for (int i = 0; i < list.size(); i++) {
			FruitItem thisItem = list.get(i);
			if (thisItem.ID == num) {
				list.remove(thisItem);
				System.out.println("��Ʒɾ�����!");
				return;
			}
		}
		System.out.println("�Բ���û�������ŵ���Ʒ!");
	}

	// �޸���Ʒ
	public static void editList(ArrayList<FruitItem> list) {
		System.out.println("������Ҫ�޸ĵ���Ʒ��ţ�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// ���¼���Ԫ��
		for (int i = 0; i < list.size(); i++) {

			FruitItem thisItem = list.get(i);
			if (thisItem.ID == num) {
				System.out.print("�������µ���ƷID:");
				thisItem.ID = sc.nextInt();
				System.out.print("�������µ���Ʒ����:");
				thisItem.name = sc.next();
				System.out.print("�������µ���Ʒ����:");
				thisItem.price = sc.nextDouble();
				System.out.println("��Ʒ��Ϣ�������!");
				return;
			}
		}
		System.out.println("�Բ���û�������ŵ���Ʒ!");

	}

}
