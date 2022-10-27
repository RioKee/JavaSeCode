package test010.java;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		//��������˵����趨
		
		  //ԭʼ����
        String[] words = {"apple", "banana", "cat", "dog"};
        System.out.println("1���鿴�������ݣ�2����ӵ��ʣ�3���޸�ָ�����ʣ�4��ɾ��ָ�����ʣ�5���˳���");
        
        while (true){
            System.out.print("��ѡ��˵�:");
            Scanner input  = new Scanner(System.in);
            int option = input.nextInt();
            
            switch (option) {
                case 1:
                	secondMenu1(words);
                    continue;
                case 2:
                    System.out.print("2����ӵ��� ");
                    secondMenu2(words);
                    continue;
                case 3:
                    System.out.println("3��ָ���޸ĵ���");
                    secondMenu3(words);
                    continue;
                case 4:
                	secondMenu4(words);
                    System.out.print("4��ɾ��ָ������ ");
                    continue;
                case 5:
                    System.out.println("�˳�����");
                    break;
                default:
                    System.out.println("��������������ѡ��");
                    continue;
            }
            break;
        }

    
	}
	
	//�����˵���ѯ����
	public static void secondMenu1(String[] words) {
		while(true){
			System.out.print("==��������Ҫ��ѯѡ�� 1:ȫ��; 2:��ȷ��ѯ; 3:ģ����ѯ; 0:������һ���˵�==\n: ");
	        String search = new Scanner(System.in).next();
	        switch(search) {
	        case "1":
	        	System.out.print("������Ϊ�� ");
	        	outWords(words);
	        	continue;
	        case "2":
	        	System.out.print("[��ȷ����]��������Ҫ���ҵĵ��ʣ� ");
	        	String str2 = new Scanner(System.in).nextLine();
	        	int index = searchWord(words, str2);
	        	System.out.println("��ѯ����� " + words[index]);
	       	    continue;
	        case "3":
	        	System.out.print("[ģ������]��������Ҫ���ҵĵ��ʣ� ");
	        	String str3 = new Scanner(System.in).nextLine();
	        	printWordLike(words, str3);
	        	continue;
	        case "0":
	        	break;
	        default:
	        	System.out.println("error:��������������ѡ��");
	        		continue;
	        }
	        break;
		}
        
	
	
	}
	
	//��ӡ�������
	public static void outWords(String[] words) {
		for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		System.out.println();
	}
	
	//��ȷ�鳭
	public static int searchWord(String[] words, String word) {
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(word)) {
				return i;
			}
		}
		return -1;
	}
	//ģ������
	public static void printWordLike(String[] words, String str){
        for(int i = 0; i < words.length; i++) {  //������һά�����Ԫ�أ�  apple  a
            if(words[i].contains(str)){
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }
	
	public static void secondMenu2(String[] words) {
		System.out.println("�˵�2�Ĺ���");
	}
	
	public static void secondMenu3(String[] words) {
		System.out.println("�˵�3�Ĺ���");
	}
	
	public static void secondMenu4(String[] words) {
		System.out.println("�˵�4�Ĺ���");
	}
	
	
	

}
