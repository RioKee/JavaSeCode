package test015;

import test014.java.homework.CodeJob;  //��ͬ����Ҫ�������ʹ��

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodeJob codeJob = new CodeJob("����С��", 10000, 500);
		System.out.println(codeJob);
	}

}


interface IA{
	public static final String name1 = "����1"; // 
	public static String name2 = "����2"; //  ���������Ǿ�̬
	public String name3 = "����3"; // 
//	public String name4; //   ���븳��ֵ
	
	public abstract void func1();  //Ĭ�ϳ��󷽷�
	void func2(); 
//	void func3() {
//		System.out.println("Ĭ�ϱ�abstract���Σ������з�����");
//	}
//	default void func4();  //����default ���η����������з�����
	default void func5() {
		
	}
	
//	static void func6();  //������̬���������з�����
	static void func7() {
	}
}

class Test implements IA{

	@Override
	public void func1() {
		System.out.println("��дfunc1");
	}

	@Override
	public void func2() {
		System.out.println("��дfunc2");
	}
	
	//�����ɷ�����д
	@Override
	public  void func5() {  //func5() �Ƿ񹹳ɷ�����д
		
	} 
	//error
//	@Override
//	static void func7() {
//	}
//	public IA() {}   //�����й�����
}

abstract class AbstractModel{
	
	public String name;  //��Ա���Կ��Բ��ó�ʼ��
	public AbstractModel() {}  //�����й�����
//	void fun1();   //����һ�㷽�������з�����
	abstract void fun3(); //abstract���εĹ��췽�������з�����
	public abstract void fun4(); 
//	private abstract void fun5();  //private static final ���������γ��󷽷�  ������дΥ��
	
	
	
	
	
	
	
	
	
	
	
}