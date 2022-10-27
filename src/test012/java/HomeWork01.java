package test012.java;

public class HomeWork01 {
	public static void main(String[] args) {
		Hero h1 = new Hero(1001, "绿巨人", "力量");
		Hero h2 = new Hero(1002, "恶灵骑士", "永生");
		Hero h3 = new Hero(1003, "鹰眼", "精准");
		h1.show();
		h2.show();
		h3.show();
	}

}

class Hero{
	private int no;
	private String nick;
	private String power;
	
	public Hero(int no, String nick, String power) {
		setNo(no);
		setNick(nick);
		setPower(power);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
	
	public void show() {
		System.out.println("no: " + no + "\tnick: " + nick + "\tpower" + power);
	}
	
	
	
}