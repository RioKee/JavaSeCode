package test013.java;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck("Truck发动机", "Truck车轮", "Truck货仓", 1000);
		truck.show();
		
		Bus bus = new Bus("Bus发动机", "Bus车轮", "Bus客舱", 2000);
		bus.show();
	}
}

class Automobile{
	public void run() {}
	public void brake() {}
	private String engine; // 发动机
	private String wheel;  //轮子
	public Automobile(String engine, String wheel) {
		this.engine = engine;
		this.wheel = wheel;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getEngine() {
		return engine;
	}
	
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	public String getWheel() {
		return wheel;
	}
}

class Truck extends Automobile{
	private String freightHouse;  //货仓
	private double weigh;  //承重
	
	public Truck(String engine, String wheel, String freightHouse, double weigh) {
		super(engine, wheel);
		this.freightHouse = freightHouse;
		this.weigh = weigh;
	} 
	
	public void inGoods() {
		System.out.println("卡车拉货货");
	}
	public void outGoods() {
		System.out.println("卡车卸货");
	}	
	
	public void show() {
		System.out.println("发动机: " + getEngine() + "\t车轮:  " + getWheel() + "\t货舱: " + freightHouse + "\t承重:  " + weigh);
	}
}

class Bus extends Automobile{
	private String cabin;  //客舱
	private int busload;  //载客量
	public Bus(String engine, String wheel, String cabin, int busload) {
		super(engine, wheel);
		this.cabin = cabin;
		this.busload = busload;
	}
	
	public void say() {
		System.out.println("公共汽车报站");
	}
	public void stop() {
		System.out.println("公共汽车停靠站台");
	}
	
	public void show() {
		System.out.println("发动机： " + getEngine() + "\t车轮： " + getWheel() + "\t客舱： " + cabin + "\t载客量： " + busload);
	}
}