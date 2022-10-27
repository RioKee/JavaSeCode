package test006.java;

public class Exer01 {
	public static void main(String[]args) {
		//随机15个数，找出最大数
		
		int max = (int)(Math.random()*100+1);
		int max1 = Integer.MIN_VALUE;
		System.out.print("随机数分别是：" + max + " ");
		for(int i = 0; i < 14; i++) {
			int num = (int)(Math.random()*100+1);
			if(max < num) {
				max = num;
			}
			System.out.print(num + " ");
		}
		System.out.println("\n最大数为：" + max);
		System.out.println(max1);
	}
}

class Exer02{
	public static void main(String[]args) {
		
		//定义数组的三种方式
		int[] arr0 = {1, 3, 4};
		int[] arr1 = new int[5];
		int[] arr2 = new int[]{1,2,3,4,5,6};
		char[] as = {'a', 'b'};
		System.out.println(as);
	}
}



