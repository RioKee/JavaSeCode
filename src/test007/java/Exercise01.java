package test007.java;

public class Exercise01 {
	public static void main(String[]args) {
		
		//ʵ��������
		Dog dog1 = new Dog();
		dog1.father();
		dog1.son();
		
	}
	

	
	public void func() {
		
	}

}

//��ļ̳�  �ؼ��� extends  ����  ����

class Animal{
	
	//Animal���巽��
	public void action() {
		
	}
	
	public void father() {
		System.out.println("���Ǹ���");
	}
	
}

//�̳и���Animal
class Dog extends Animal{
	String name;
	int age;
	public void son() {
		System.out.println("��������");
	}
}