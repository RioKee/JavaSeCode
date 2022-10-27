package test010.java;

public class HomeWork01 {

	public static void main(String[] args) {
		Hear h1 = new Hear(1001, "绿巨人", "力量");
		
		Hear h2 = new Hear();
		h2.setNo(1002);
		h2.setName("恶灵骑士");
		h2.setPower("永生");
		
		Hear h3 = new Hear(1003, "鹰眼", "精确");
		
		h1.hearInfo();
		h2.hearInfo();
		h3.hearInfo();
	}
}
