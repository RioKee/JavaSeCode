package test020.java.shopping;

public class Goods {
	// 编号，名称，单价，数量；
	private int num;
	private String name;
	private double price;
	private int quantity;
	
	public Goods(int num, String name, double price, int quantity) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return num + "\t" + name + "\t" + price + "\t" + quantity + "\n";
	}
	
	public String info() {
		return num + "\t" + name + "\t" + price + "\t" + quantity + "\n";
	}
	
	

}
