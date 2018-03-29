package courseDesign;

import java.util.Scanner;

public class Animal {
	//���嶯������
	int number;
	String kind;
	int age;
	String color;
	double weight;
	//�вι��췽��
	public Animal(int number, String kind, int age, String color,double weight) {
		super();
		this.number = number;
		this.kind = kind;
		this.age = age;
		this.color = color;
		this.weight = weight;
	}
	//�޲ι��췽��
	public Animal() {
		super();
	}
	//������������
	Animal[] animal = new Animal[3];
	Scanner reader = new Scanner(System.in);
	//��õ�ǰ�����ж�������
	public int getAnimalNum() {
		int i = 0;
		while(animal[i] != null) {
			i++;
		} 
		return i;
	}
	//���ӳ�����Ϣ
	public void add(Animal a1) {
		int n = getAnimalNum();
			System.out.print("�����������:");
			a1.number = reader.nextInt();
			System.out.print("�������������:");
			a1.kind = reader.next();
			System.out.print("�����������ɫ:");
			a1.color = reader.next();	
			System.out.print("�������������:");
			a1.age = reader.nextInt();
			System.out.print("�������������:");
			a1.weight = reader.nextDouble();
			for(int j = 0; j < animal.length; j++) {
				if(animal[j] != null)
					n++;
			}
			animal[n] = a1;
			System.out.println("��ӳɹ�!");
				
			
	}
	//ɾ��������Ϣ�����ݳ������
	public void delete (int number1) {
		for(int i = 0; i < animal.length; i++) {
			if(animal[i].number == number1) {
				animal[i] = null;
				System.out.println("ɾ���ɹ�!");
				//�������ֵ������ǰ��ֵ
				for(int j = i; j < animal.length-1; j++) {
					animal[j] = animal[j+1];
				}
				break;
			}
		}
	}
	//�޸ĳ�����Ϣ�����ݳ������
	public void revise(int number2,Animal a1) {
		for(int i = 0; i < animal.length; i++) {
			if(animal[i].number == number2)
			{
				System.out.print("�޸ĺ�ĳ�����:");
				a1.number = reader.nextInt();	
				System.out.print("�޸ĺ�ĳ�������:");
				a1.kind = reader.next();
				System.out.print("�޸ĺ�ĳ�������:");
				a1.age = reader.nextInt();
				System.out.print("�޸ĺ�ĳ�����ɫ:");
				a1.color = reader.next();
				System.out.print("�޸ĺ�ĳ�������:");
				a1.weight = reader.nextInt();
				animal[i] = a1;
				System.out.println("�޸ĳɹ�!");
				break;
			}
		}
	}
	//���ҳ�����Ϣ�����ݳ������
	public void search(int number3) {
		for(int i = 0; i <= animal.length; i++) {
			if(animal[i].number == number3) {
				System.out.println("��� :"+animal[i].number+",���ࣺ"+animal[i].kind+",���䣺"+animal[i].age+",ëɫ��"+animal[i].color+",���أ�"+animal[i].weight);
				break;
			}
		}
	}
	//��ʾ���г�����Ϣ
	public void show()
	{
		for(int i = 0; i < animal.length; i++) {
			if(animal[i] != null)
				System.out.println("��� :"+animal[i].number+",���ࣺ"+animal[i].kind+",���䣺"+animal[i].age+",ëɫ��"+animal[i].color+",���أ�"+animal[i].weight);
				
		}
	}
}
