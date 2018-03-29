package courseDesign;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal();
		Scanner reader = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println("---------宠物管理系统--------");
		System.out.println("-------1 增加宠物信息--------");
		System.out.println("-------2 删除宠物信息--------");
		System.out.println("-------3 更改宠物信息--------");
		System.out.println("-------4 查找宠物信息--------");
		System.out.println("-------5 所有宠物信息--------");
		System.out.println("-------0 退出查询系统--------");
		System.out.print("请输入你的操作序号:");
			int num = reader.nextInt();
			switch (num) {
			case 1:
				System.out.println("请输入添加宠物的信息:");
				//调用增加宠物方法
				a.add(a);
				break;
			case 2:
				System.out.print("请输入删除宠物的编号:");
				int number1=reader.nextInt();
				//调用删除宠物方法
				a.delete(number1);
				break;
			case 3:
				System.out.print("请输入修改宠物的编号:");
				int number2=reader.nextInt();
				//调用修改宠物方法
				a.revise(number2, a);
				break;
			case 4:
				System.out.print("请输入查找宠物的编号:");
				int number3 = reader.nextInt();
				//调用查找宠物方法
				a.search(number3);
				break;
			case 5:
				//调用显示所有宠物信息方法
				a.show();
				break;
			case 0:
				System.out.println("感谢使用!");
				flag = false;
				break;
			default:
				System.out.println("输入错误!");
				break;	
			}
		}
	}
}
