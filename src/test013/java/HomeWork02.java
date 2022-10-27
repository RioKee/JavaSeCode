package test013.java;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck("Truck������", "Truck����", "Truck����", 1000);
		truck.show();
		
		Bus bus = new Bus("Bus������", "Bus����", "Bus�Ͳ�", 2000);
		bus.show();
	}
}

class Automobile{
	public void run() {}
	public void brake() {}
	private String engine; // ������
	private String wheel;  //����
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
	private String freightHouse;  //����
	private double weigh;  //����
	
	public Truck(String engine, String wheel, String freightHouse, double weigh) {
		super(engine, wheel);
		this.freightHouse = freightHouse;
		this.weigh = weigh;
	} 
	
	public void inGoods() {
		System.out.println("����������");
	}
	public void outGoods() {
		System.out.println("����ж��");
	}	
	
	public void show() {
		System.out.println("������: " + getEngine() + "\t����:  " + getWheel() + "\t����: " + freightHouse + "\t����:  " + weigh);
	}
}

class Bus extends Automobile{
	private String cabin;  //�Ͳ�
	private int busload;  //�ؿ���
	public Bus(String engine, String wheel, String cabin, int busload) {
		super(engine, wheel);
		this.cabin = cabin;
		this.busload = busload;
	}
	
	public void say() {
		System.out.println("����������վ");
	}
	public void stop() {
		System.out.println("��������ͣ��վ̨");
	}
	
	public void show() {
		System.out.println("�������� " + getEngine() + "\t���֣� " + getWheel() + "\t�Ͳգ� " + cabin + "\t�ؿ����� " + busload);
	}
}