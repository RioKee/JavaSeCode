package test006.java;

public class Methes {
	public static void main(String[]args) {
		
//		String cs = "ahsjhdlahd";
//		String str = "b";
//		
////		if()
//		System.out.println(cs.indexOf(str));
		
		//��¼�������±�
		int index = 0;
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		
		System.out.print("����ֱ��ǣ�");
		for(int i = 0; i < arr.length; i++) {
			if(arr[index] > arr[i]) {
				index = i;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n��Сֵ��" + arr[index] + "\t ��Сֵ�±꣺" + index);
	}
}
