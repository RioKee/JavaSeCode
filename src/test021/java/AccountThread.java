package test021.java;

public class AccountThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account("ICBC" , 100000);
		new DrawMoney("С��",acc).start();
		new DrawMoney("С��",acc).start();
	}

}
class Account{
	// �����һ���˻� 
	private String name;
	private double money;
	
	public Account(String name, double money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public void drawMoney(double money) {
		String name = Thread.currentThread().getName();
		
		if(this.money >= money) {
			System.out.println(name + "��ȡǮ" + "�³�" + money);
			
			this.money -= money;
			
			System.out.println("�˻����: " + this.money);
			
		}else {
			System.out.println(name + "��ȡǮ����");
		}
	}
	
	
}

class DrawMoney extends Thread{
	
	private Account acc;
	public DrawMoney(String name, Account acc) {
		super(name);  // �޸��̵߳�����
		this.acc = acc;
	}
	
	
	@Override
	public void run() {
		acc.drawMoney(100000);
	}
	
}