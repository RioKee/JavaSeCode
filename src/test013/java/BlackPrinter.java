package test013.java;

public class BlackPrinter extends Printer{
	
	public BlackPrinter(String content) {
		super(content);
	}	
	public void scan() {
		System.out.println("黑白打印机-扫描功能" + " 扫描：" + getContent());		
	}
	@Override
	public void print() {
		System.out.println("黑白-打印功能" + " 输出： " + getContent());
	}
	
}