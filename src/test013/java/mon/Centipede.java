package test013.java.mon;

public class Centipede extends GameRole {
	public Centipede(String name, int blood, int powerNum, String skill) {
		super(name, blood, powerNum, skill);
	}
	@Override
	public void attack() {
		System.out.println("����" + getName() + "ʹ��[" + getSkill() + "] ����" );
	}
	@Override
	public void move() {
		System.out.println("�������֣��������");
	}
	
	public void gameView() {
		attack();
		System.out.println(
				"��ǰ����ֵ��" + getBlood() + "\n" +
				"�������� " + getPowerNum());
		System.out.println("��ǰ����ֵ��" + getBlood());
		move();
		System.out.println("=========================");
	}
}
