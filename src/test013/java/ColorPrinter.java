package test013.java;

public class ColorPrinter extends Printer{
	public ColorPrinter(String content) {
		super(content);
	}
	public void copy() {
		System.out.println("��ɫ��ӡ��-��ӡ����" + " ��ӡ�� " + getContent());
	}	
	@Override
	public void print() {
		System.out.println("��ɫ-��ӡ����" + " ����� " + getContent());
	}		
}
