package test006.java;

public class Exer01 {
	public static void main(String[]args) {
		//���15�������ҳ������
		
		int max = (int)(Math.random()*100+1);
		int max1 = Integer.MIN_VALUE;
		System.out.print("������ֱ��ǣ�" + max + " ");
		for(int i = 0; i < 14; i++) {
			int num = (int)(Math.random()*100+1);
			if(max < num) {
				max = num;
			}
			System.out.print(num + " ");
		}
		System.out.println("\n�����Ϊ��" + max);
		System.out.println(max1);
	}
}

class Exer02{
	public static void main(String[]args) {
		
		//������������ַ�ʽ
		int[] arr0 = {1, 3, 4};
		int[] arr1 = new int[5];
		int[] arr2 = new int[]{1,2,3,4,5,6};
		char[] as = {'a', 'b'};
		System.out.println(as);
	}
}



