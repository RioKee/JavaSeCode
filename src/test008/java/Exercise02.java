package test008.java;

public class Exercise02 {
	public static void main(String[]args) {
		
		double res = 12.1231231;
		
		double one = 5.864;
		String  str = String.format("%.2f",one);
		double four = Double.parseDouble(str);
		
	}
	
	
	private String a;  
	String b;
	protected String c;
	public String d;
	
	void printA(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	
}
