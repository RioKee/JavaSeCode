package test004.java;

public class Home04_02 {
	public static void main(String[]args) {
		//7ʵ��Բ�ĺ������ã��������
		int r=5; 
		int h=10;
		System.out.println("Բ�������"+calaCircularArea(r));
		System.out.println("Բ�������"+calaCylinderVolume(r,h));
		System.out.println("Բ׶�����"+calaConeVolume(r,h));
	}
	
	public static double calaCircularArea(int r) {
		return r*r*3.14;
	}
	
	public static double calaCylinderVolume(int r,int h) {
//		return h*r*r*3.14;
		return calaCircularArea(r)*h;
		
	}
	
	public static double calaConeVolume(int r,int h) {
		return calaCircularArea(r)*h/3;
	}
	
}
