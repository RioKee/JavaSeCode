package test013.java;

public class Exercise03 {
	public static void main(String[] args) {		
		ColorPrinter colorPrinter = new ColorPrinter("º£±¨");
		colorPrinter.print();
		colorPrinter.copy();
	
		System.out.println("=====================");
		BlackPrinter blackPrinter = new BlackPrinter("±Ê¼Ç");
		blackPrinter.print();
		blackPrinter.scan();
	}
}


