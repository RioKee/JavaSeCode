package test013.java.mon;

public class GameRole {
	private String name;  //名称
	private int blood;	//生命值
	private int powerNum;  //攻击力
	
	private String skill;
	
	public GameRole(String name, int blood, int powerNum, String skill) {
		this.name = name;
		this.blood = blood;
		this.powerNum = powerNum;
		this.skill = skill;
	}
	
	public void move() {}  //移动
	public void attack() {}	//攻击

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public int getPowerNum() {
		return powerNum;
	}

	public void setPowerNum(int powerNum) {
		this.powerNum = powerNum;
	}
	
	public String getSkill() {
		return skill;
	}
	

}
