package test010.java;

public class Hear {
	private int no;
	private String name;
	private String power;
	
	public Hear(){  //无参构造器
		
	}
	
	public Hear(int no, String name, String power) {  //有参构造器
		this.no = no;
		this.name = name;
		this.power = power;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getPower() {
		return power;
	}
	
	public void hearInfo() {
		System.out.println("编号： " + no + " 昵称： " + name + " 能力：" + power);
	}
	
	
}
