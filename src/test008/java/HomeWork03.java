package test008.java;

import java.util.Scanner;

public class HomeWork03 {
	public static void main(String[]args) {
		String[][] words = {{"apple"}, {"banana"}, {"car"}, {"dog"}}; 
		
		//实例二维数组自定义方法，遍历输出数组
		ArrPlus arr = new ArrPlus();
		arr.arrFormat(words);
		
//		for(int i = 0; i < words.length; i++) {
//			for(int j = 0; j < words[i].length; j++) {
//				System.out.print(words[i][j] + " ");
//			}
//		}
		
		
		System.out.print("\n请输入单词:");
		String str = new Scanner(System.in).next();
		
		C h4 = new C();
		boolean type;
		type = h4.work4(words,str);
		if(type) {
			System.out.println(str + "存在");
		}else {
			System.out.println(str + "不存在");
		}
	}
}

class C {
	
	public boolean work4(String[][] strs, String str) {
		
		for(int i = 0; i < strs.length; i++) {
			for(int j = 0; j < strs[i].length; j++) {
				if(str.equals(strs[i][j])) {
					return true;
				}
			}
		}
		return false;
	}
}

class ArrPlus{
	
	public void arrFormat(String[][] words) {
		for(int i = 0; i < words.length; i++) {
			for(int j = 0; j < words[i].length; j++) {
				System.out.print(words[i][j] + " ");
			}
		}
	}
}