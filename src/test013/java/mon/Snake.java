package test013.java.mon;

public class Snake extends GameRole {
	
	public Snake(String name, int blood, int powerNum, String skill) {
		super(name, blood, powerNum, skill);

		
	}
	
	
	public void skillBlood() {  //特有技能
		if(getBlood() < 10) {
			System.out.print("实施大补血术。。。。");
			setBlood(getBlood() + 20);
		}
//		setBlood(getBlood());
	}
	
	@Override
	public void move() {
		System.out.println("我是蛇怪，我走S型路线");
	}
	@Override
	public void attack() {
		System.out.println("怪物" + getName() + "使用[" + getSkill() + "] 攻击" );
	}
	
	
	public void gameView() {
		attack();
		System.out.println(
				"当前生命值：" + getBlood() + "\n" +
				"攻击力： " + getPowerNum());
		skillBlood();
		System.out.println("当前生命值：" + getBlood());
		move();
		System.out.println("=========================");
	}
	
	
}
