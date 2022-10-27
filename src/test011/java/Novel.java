package test011.java;

public class Novel {
	public int no;
	public String name;
	public String author;
	public int fans;
	
	public Novel() {}
	
	public Novel(int no, String name, String author, int fans) {
		this.no = no;
		this.author = author;
		this.name = name;
		this.fans = fans;
	}
	
	public void info() {
		System.out.println(no + "\t" + name + "\t" + author + "\t" + fans);;
	}
	
	
}
