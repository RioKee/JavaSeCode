package test015;

public class HomeWork2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view(new Person());
		view(new Fish());
		view(new Submarine());
	}
	public static void view(Swimm swimm) {
		swimm.swimming();
	}

}
/**
 * ����һ�� �ӿڶ�̬
����һ����Ӿ�ӿڡ�
ʹ�ö�̬ʵ�֣��������Ӿ��
                      �˿�����Ӿ��
                      Ǳˮͧ������Ӿ��
 */
interface Swimm{
	void swimming();
}
class Submarine implements Swimm{
	@Override
	public void swimming() {
		System.out.println("Ǳˮͧ������Ӿ");
	}
}
class Fish implements Swimm{
	@Override
	public void swimming() {
		System.out.println("���������Ӿ");
	}
}
class Person implements Swimm{
	@Override 
	public void swimming() {
		System.out.println("��������Ӿ");
	}
}