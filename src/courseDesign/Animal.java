package courseDesign;

import java.util.Scanner;

public class Animal {
	//定义动物属性
	int number;
	String kind;
	int age;
	String color;
	double weight;
	//有参构造方法
	public Animal(int number, String kind, int age, String color,double weight) {
		super();
		this.number = number;
		this.kind = kind;
		this.age = age;
		this.color = color;
		this.weight = weight;
	}
	//无参构造方法
	public Animal() {
		super();
	}
	//定义宠物店容量
	Animal[] animal = new Animal[3];
	Scanner reader = new Scanner(System.in);
	//获得当前数组中动物数量
	public int getAnimalNum() {
		int i = 0;
		while(animal[i] != null) {
			i++;
		} 
		return i;
	}
	//增加宠物信息
	public void add(Animal a1) {
		int n = getAnimalNum();
			System.out.print("请输入宠物编号:");
			a1.number = reader.nextInt();
			System.out.print("请输入宠物种类:");
			a1.kind = reader.next();
			System.out.print("请输入宠物颜色:");
			a1.color = reader.next();	
			System.out.print("请输入宠物年龄:");
			a1.age = reader.nextInt();
			System.out.print("请输入宠物体重:");
			a1.weight = reader.nextDouble();
			for(int j = 0; j < animal.length; j++) {
				if(animal[j] != null)
					n++;
			}
			animal[n] = a1;
			System.out.println("添加成功!");
				
			
	}
	//删除宠物信息，根据宠物序号
	public void delete (int number1) {
		for(int i = 0; i < animal.length; i++) {
			if(animal[i].number == number1) {
				animal[i] = null;
				System.out.println("删除成功!");
				//将后面的值依次向前赋值
				for(int j = i; j < animal.length-1; j++) {
					animal[j] = animal[j+1];
				}
				break;
			}
		}
	}
	//修改宠物信息，根据宠物序号
	public void revise(int number2,Animal a1) {
		for(int i = 0; i < animal.length; i++) {
			if(animal[i].number == number2)
			{
				System.out.print("修改后的宠物编号:");
				a1.number = reader.nextInt();	
				System.out.print("修改后的宠物种类:");
				a1.kind = reader.next();
				System.out.print("修改后的宠物年龄:");
				a1.age = reader.nextInt();
				System.out.print("修改后的宠物颜色:");
				a1.color = reader.next();
				System.out.print("修改后的宠物体重:");
				a1.weight = reader.nextInt();
				animal[i] = a1;
				System.out.println("修改成功!");
				break;
			}
		}
	}
	//查找宠物信息，根据宠物序号
	public void search(int number3) {
		for(int i = 0; i <= animal.length; i++) {
			if(animal[i].number == number3) {
				System.out.println("编号 :"+animal[i].number+",种类："+animal[i].kind+",年龄："+animal[i].age+",毛色："+animal[i].color+",体重："+animal[i].weight);
				break;
			}
		}
	}
	//显示所有宠物信息
	public void show()
	{
		for(int i = 0; i < animal.length; i++) {
			if(animal[i] != null)
				System.out.println("编号 :"+animal[i].number+",种类："+animal[i].kind+",年龄："+animal[i].age+",毛色："+animal[i].color+",体重："+animal[i].weight);
				
		}
	}
}
