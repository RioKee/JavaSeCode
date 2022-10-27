package test012.java;

public class HomeWork02 {
	public static void main(String[] args) {
		Novel n1 = new Novel(1001, "武动乾坤", "天蚕土豆", "热血");
		Novel n2 = new Novel(1002, "神墓", "辰东", "冒险");
		Novel n3 = new Novel(1003, "狂神", "唐家三少", "玄幻");		
		Novel n4 = new Novel(999, "斗破苍穹", "天蚕土豆", "玄幻");
		
		n1.show();
		n2.show();
		n3.show();
		n4.show();
	}

}

class Novel{
	private int no;
	private String name;
	private String power;
	private String type;
	
	public Novel(int no, String name, String power, String type) {
		setNo(no);
		this.name =name;
		this.power = power;
		this.type = type;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		if(no < 1000) {
			System.out.println("error：数据编号要在1000-1999之间，默认值为1000");
			this.no = 1000;
			return ;
		}
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void show() {
		System.out.println("no: " + no + "\t name=" + name + "\t power" + power + "\t type" + type);
	}
	
	
}