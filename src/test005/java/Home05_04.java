package test005.java;

public class Home05_04 {
	public static void main(String[]args) {
		//����ͬ��������   36ͷ  78��
		
		for(int x=0;x<=36;x++) {
			if((36-x)>0 && x*2+(36-x)*4==78) {
				System.out.println("���У�"+x+"\t�����У�"+(36-x));
			}
		}
	}
}
