package test020.java.shopping;
import java.util.Scanner;
public class Utils {
	// 工具类，提供输入的校验
	public static String inputStr() {			
		String str = new Scanner(System.in).next();	
		return str;
	}
	
	public static int inputInt() {			
		String str = new Scanner(System.in).next();
		int n = 0;
		try {
			n = Integer.parseInt(str);
		}catch(Exception e) {	
			return 0;
		}					
		return n;
	}
	
	public static double inputDouble() {			
		String str = new Scanner(System.in).next();	
		double n = 0;
		try {
			n = Double.parseDouble(str);
		}catch(Exception e) {	
			return 0;
		}
		return n;
	}

}
