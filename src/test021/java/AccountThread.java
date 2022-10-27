package test021.java;

public class AccountThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account("ICBC" , 100000);
		new DrawMoney("小红",acc).start();
		new DrawMoney("小明",acc).start();
	}

}
class Account{
	// 这就是一个账户 
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
			System.out.println(name + "来取钱" + "吐出" + money);
			
			this.money -= money;
			
			System.out.println("账户余额: " + this.money);
			
		}else {
			System.out.println(name + "来取钱余额不足");
		}
	}
	
	
}

class DrawMoney extends Thread{
	
	private Account acc;
	public DrawMoney(String name, Account acc) {
		super(name);  // 修改线程的名字
		this.acc = acc;
	}
	
	
	@Override
	public void run() {
		acc.drawMoney(100000);
	}
	
}