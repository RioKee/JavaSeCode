package test012.java;

public class HomeWork05_SingleMode {

}

/**
 * ���ģʽ��������ģʽ
 * 
 * ����ģʽд��������ʽ������ʽ���Ǽ�ʽ ����ģʽ�ص㣺 
 * 1������ģʽֻ����һ��ʵ��
 * 2������������Լ������Լ�Ψһ��ʾ��
 * 3���������������������ṩ������һʵ��
 *
 */

//����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ�����Լ� 
class Singleton {
	private Singleton() {
	}

	private static Singleton single = null;

	// ��̬��������
	public static Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
}


