package test013.java;

public class BlackPrinter extends Printer{
	
	public BlackPrinter(String content) {
		super(content);
	}	
	public void scan() {
		System.out.println("�ڰ״�ӡ��-ɨ�蹦��" + " ɨ�裺" + getContent());		
	}
	@Override
	public void print() {
		System.out.println("�ڰ�-��ӡ����" + " ����� " + getContent());
	}
	
}