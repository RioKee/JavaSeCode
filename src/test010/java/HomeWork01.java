package test010.java;

public class HomeWork01 {

	public static void main(String[] args) {
		Hear h1 = new Hear(1001, "�̾���", "����");
		
		Hear h2 = new Hear();
		h2.setNo(1002);
		h2.setName("������ʿ");
		h2.setPower("����");
		
		Hear h3 = new Hear(1003, "ӥ��", "��ȷ");
		
		h1.hearInfo();
		h2.hearInfo();
		h3.hearInfo();
	}
}
