package test013.java;

public class Printer{	
	private String content;
	public Printer(String content) {
		this.content = content;
	}	
	public void print() {
		System.out.println("��ӡ����");
	}	
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}

	
}
