package test007.java;

public class Exercise02 {
	public static void main(String[]args) {
		//[12, 12, 12, 12]  �����ʽ
		int[] arr = new int[10];
		
		//��ʼ����ֵ����,�����Ԫ��
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.print("\n[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			}else {
				System.out.print(arr[i] + ", ");
			}
			
		}
	}
}
