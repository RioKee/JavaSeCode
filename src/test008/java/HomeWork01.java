package test008.java;

public class HomeWork01 {
	public static void main(String[] args) {
	
		h1();	
		
	}
	
	
	//1.int[][] nums = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
	//二维数组中的元素，全部输出
	public static void h1() {
		int[][] nums = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print((char)nums[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
}
