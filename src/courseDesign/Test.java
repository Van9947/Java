package courseDesign;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal();
		Scanner reader = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println("---------�������ϵͳ--------");
		System.out.println("-------1 ���ӳ�����Ϣ--------");
		System.out.println("-------2 ɾ��������Ϣ--------");
		System.out.println("-------3 ���ĳ�����Ϣ--------");
		System.out.println("-------4 ���ҳ�����Ϣ--------");
		System.out.println("-------5 ���г�����Ϣ--------");
		System.out.println("-------0 �˳���ѯϵͳ--------");
		System.out.print("��������Ĳ������:");
			int num = reader.nextInt();
			switch (num) {
			case 1:
				System.out.println("��������ӳ������Ϣ:");
				//�������ӳ��﷽��
				a.add(a);
				break;
			case 2:
				System.out.print("������ɾ������ı��:");
				int number1=reader.nextInt();
				//����ɾ�����﷽��
				a.delete(number1);
				break;
			case 3:
				System.out.print("�������޸ĳ���ı��:");
				int number2=reader.nextInt();
				//�����޸ĳ��﷽��
				a.revise(number2, a);
				break;
			case 4:
				System.out.print("��������ҳ���ı��:");
				int number3 = reader.nextInt();
				//���ò��ҳ��﷽��
				a.search(number3);
				break;
			case 5:
				//������ʾ���г�����Ϣ����
				a.show();
				break;
			case 0:
				System.out.println("��лʹ��!");
				flag = false;
				break;
			default:
				System.out.println("�������!");
				break;	
			}
		}
	}
}
