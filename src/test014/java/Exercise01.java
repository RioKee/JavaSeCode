package test014.java;

public class Exercise01 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";  //s2û�п����µĿռ䣬�ǽ�����ԭ�е���s2  ����ָ��ֵ��s2  
		String s3 = new String("hello");
		
		System.out.println(s1 == s2);  //ture
		System.out.println(s1 == s3);  //false 
				
	}
	
}

class Person1{
	public static void run() {
		
	}
}

class Doctor extends Person1{
	
//	@Override
//	public void run() {	
//		//���಻����д��̬���� �����󷽷�������д��������󷽷�ʹ��static���Σ���ô��Υ���˳��󷽷����뱻��д�����
//	}
}