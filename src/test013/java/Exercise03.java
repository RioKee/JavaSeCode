package test013.java;

public class Exercise03 {
	public static void main(String[] args) {		
		ColorPrinter colorPrinter = new ColorPrinter("����");
		colorPrinter.print();
		colorPrinter.copy();
	
		System.out.println("=====================");
		BlackPrinter blackPrinter = new BlackPrinter("�ʼ�");
		blackPrinter.print();
		blackPrinter.scan();
	}
}


