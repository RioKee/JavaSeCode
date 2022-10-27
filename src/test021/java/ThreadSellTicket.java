package test021.java;


public class ThreadSellTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellTicket sellTicket = new SellTicket();
		Thread win1 = new Thread(sellTicket,"����1");
		Thread win2 = new Thread(sellTicket,"����2");
		win1.start();
		win2.start();
	}

}
class SellTicket implements Runnable{	
	
	private int ticketNum = 20;		
	public  void sell() {
		if(ticketNum > 0) {		
			System.out.println(Thread.currentThread().getName() + 
					"����һ��Ʊ����ʣ" + (--ticketNum) + "��Ʊ");
		}
	}
		
	@Override
	public void run() {
		 for(int i = 0; i < 10; i++) {
			 
			 synchronized (this) {
				 sell();
			 }
			 
			 try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }	
	}
}