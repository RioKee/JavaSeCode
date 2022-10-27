package test010.java;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		//完成两级菜单的设定
		
		  //原始数据
        String[] words = {"apple", "banana", "cat", "dog"};
        System.out.println("1、查看所有数据；2、添加单词；3、修改指定单词；4、删除指定单词；5、退出；");
        
        while (true){
            System.out.print("请选择菜单:");
            Scanner input  = new Scanner(System.in);
            int option = input.nextInt();
            
            switch (option) {
                case 1:
                	secondMenu1(words);
                    continue;
                case 2:
                    System.out.print("2、添加单词 ");
                    secondMenu2(words);
                    continue;
                case 3:
                    System.out.println("3、指定修改单词");
                    secondMenu3(words);
                    continue;
                case 4:
                	secondMenu4(words);
                    System.out.print("4、删除指定单词 ");
                    continue;
                case 5:
                    System.out.println("退出程序");
                    break;
                default:
                    System.out.println("输入有误，请重新选择");
                    continue;
            }
            break;
        }

    
	}
	
	//二级菜单查询功能
	public static void secondMenu1(String[] words) {
		while(true){
			System.out.print("==请输入需要查询选项 1:全部; 2:精确查询; 3:模糊查询; 0:返回上一级菜单==\n: ");
	        String search = new Scanner(System.in).next();
	        switch(search) {
	        case "1":
	        	System.out.print("输出结果为： ");
	        	outWords(words);
	        	continue;
	        case "2":
	        	System.out.print("[精确查找]请输入你要查找的单词： ");
	        	String str2 = new Scanner(System.in).nextLine();
	        	int index = searchWord(words, str2);
	        	System.out.println("查询结果： " + words[index]);
	       	    continue;
	        case "3":
	        	System.out.print("[模糊查找]请输入你要查找的单词： ");
	        	String str3 = new Scanner(System.in).nextLine();
	        	printWordLike(words, str3);
	        	continue;
	        case "0":
	        	break;
	        default:
	        	System.out.println("error:输入有误，请重新选择");
	        		continue;
	        }
	        break;
		}
        
	
	
	}
	
	//打印输出函数
	public static void outWords(String[] words) {
		for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		System.out.println();
	}
	
	//精确查抄
	public static int searchWord(String[] words, String word) {
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(word)) {
				return i;
			}
		}
		return -1;
	}
	//模糊查找
	public static void printWordLike(String[] words, String str){
        for(int i = 0; i < words.length; i++) {  //遍历出一维数组的元素，  apple  a
            if(words[i].contains(str)){
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }
	
	public static void secondMenu2(String[] words) {
		System.out.println("菜单2的功能");
	}
	
	public static void secondMenu3(String[] words) {
		System.out.println("菜单3的功能");
	}
	
	public static void secondMenu4(String[] words) {
		System.out.println("菜单4的功能");
	}
	
	
	

}
