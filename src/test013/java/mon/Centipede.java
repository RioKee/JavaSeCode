package test013.java.mon;

public class Centipede extends GameRole {
	public Centipede(String name, int blood, int powerNum, String skill) {
		super(name, blood, powerNum, skill);
	}
	@Override
	public void attack() {
		System.out.println("怪物" + getName() + "使用[" + getSkill() + "] 攻击" );
	}
	@Override
	public void move() {
		System.out.println("我是蜈蚣怪，御风飞行");
	}
	
	public void gameView() {
		attack();
		System.out.println(
				"当前生命值：" + getBlood() + "\n" +
				"攻击力： " + getPowerNum());
		System.out.println("当前生命值：" + getBlood());
		move();
		System.out.println("=========================");
	}
}
