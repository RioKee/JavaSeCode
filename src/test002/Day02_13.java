package test002;

public class Day02_13 {
	public static void main(String[]args) {
//		int a,b,c;
//		a=10;b=20;c=30;
////		System.out.println(a,b,c);
//		System.out.println(a);
//		System.out.println(1+1+"1");
//		
		
//		int a = 1; 
//		int b = 10; 
//		a+=b+=a+=b; 
//		System.out.println(a + " " + b); 
		
		String left="����5";		//����ħ��ʦ���ֵ���
		String right="����8";		//����ħ��ʦ���ֵ���
		String box="";		//����һ���м��ű���
		System.out.println("����ǰ");
		System.out.println("ħ��ʦ���ֵ��ƣ�"+left+"\t\tħ��ʦ���ֵ��ƣ�"+right);
		box=right;  //�����ֵ���
		right=left; //�����ҵ��Ƹ�
		left=box;	//��������ֵ��Ʒŵ�����
		System.out.println("������");
		System.out.println("ħ��ʦ���ֵ��ƣ�"+left+"\t\tħ��ʦ���ֵ��ƣ�"+right);
	
				
	}

}
