package test016.java;

import java.util.Scanner;

/**
 * ����������Ψ�����
 *
 * @author:kee
 */
public class LeftString {
    public static void main(String[] args) {
        System.out.print("������һ���ַ�����");
        String str = new Scanner(System.in).next();
        System.out.print("�������ȡ�����ַ��ַ�����");
        int i = new Scanner(System.in).nextInt();
        System.out.println("��ȡ�����ַ��ǣ�" + Left.leftString(str, i));
    }
}
class Left{
    public static String leftString(String str, int n){
        return str.substring(0,n);
    }
}
