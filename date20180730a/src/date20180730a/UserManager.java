package date20180730a;

import java.util.Scanner;

public class UserManager {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		
		while (true) {
			System.out.println("------------用户管理------------");
			System.out.println("1.添加\t2.删除\t3.修改\t4.查询\t5.查询全部\t0.退出 ");
			System.out.println("请选择业务");
			String chioce = sc.nextLine();
			switch (chioce) {
			case "1":
				add();
				break;
			case "2":
				delete();
				break;
			case "3":
				update();
				break;
			case "4":
				selectOne();
				break;
			case "5":
				selectAll();
				break;
			case "0":
				System.out.println("谢谢使用");
				System.exit(0);
				break;

			default:
				System.out.println("输入错误请重试");
				break;
			}
		}

	}

	private static void selectAll() {
	}

	private static void selectOne() {
	}

	private static void update() {
	}

	private static void delete() {
	}

	private static void add() {
		//显示
		System.out.print("请输入用户名：");
		String userName = sc.nextLine();

		System.out.print("请输入密码：");
		String password = sc.nextLine();

		System.out.print("请输入真实姓名：");
		String realName = sc.nextLine();
		
		System.out.print("请输入年龄：");
		int age = sc.nextInt();
		
		

	}

}
