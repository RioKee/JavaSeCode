package test018.java.exceptionhomework;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork03 hm3 = new HomeWork03();
		hm3.isTriangle(1, 2, 3);
		System.out.println("==============");
		hm3.isTriangle(1, 2, 4);
	}
	public void isTriangle(int a, int b, int c) {
		try {
			if(a + b < c || a + c < b || b + c < c) {
				throw new IllegalArgumentException(a, b, c);				
			}
			System.out.println(a + ", " + b + ", " + c + " " + "�ܹ���������");
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
//��������
//дһ������void isTriangle(int a,int b,int c)���ж����������Ƿ��ܹ���һ�������Σ�
//����������׳��쳣IllegalArgumentException����ʾ�쳣��Ϣ ��a,b,c���ܹ��������Ρ���
//������Թ�������ʾ�����������߳������ô˷������������쳣��
class IllegalArgumentException extends Exception{	
	public IllegalArgumentException(int a, int b, int c) {		
		super(a + ", " + b + ", " + c + " " + "������������");		
	}
}