package test013.java.mon;

public class Snake extends GameRole {
	
	public Snake(String name, int blood, int powerNum, String skill) {
		super(name, blood, powerNum, skill);

		
	}
	
	
	public void skillBlood() {  //���м���
		if(getBlood() < 10) {
			System.out.print("ʵʩ��Ѫ����������");
			setBlood(getBlood() + 20);
		}
//		setBlood(getBlood());
	}
	
	@Override
	public void move() {
		System.out.println("�����߹֣�����S��·��");
	}
	@Override
	public void attack() {
		System.out.println("����" + getName() + "ʹ��[" + getSkill() + "] ����" );
	}
	
	
	public void gameView() {
		attack();
		System.out.println(
				"��ǰ����ֵ��" + getBlood() + "\n" +
				"�������� " + getPowerNum());
		skillBlood();
		System.out.println("��ǰ����ֵ��" + getBlood());
		move();
		System.out.println("=========================");
	}
	
	
}
