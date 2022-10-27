package test013.java;

public class ColorPrinter extends Printer{
	public ColorPrinter(String content) {
		super(content);
	}
	public void copy() {
		System.out.println("彩色打印机-复印功能" + " 复印： " + getContent());
	}	
	@Override
	public void print() {
		System.out.println("彩色-打印功能" + " 输出： " + getContent());
	}		
}
