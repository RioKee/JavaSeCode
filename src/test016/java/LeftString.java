package test016.java;

import java.util.Scanner;

/**
 * 我亦无他，唯手熟尔
 *
 * @author:kee
 */
public class LeftString {
    public static void main(String[] args) {
        System.out.print("请输入一行字符串：");
        String str = new Scanner(System.in).next();
        System.out.print("输入从左取几个字符字符串：");
        int i = new Scanner(System.in).nextInt();
        System.out.println("你取出的字符是：" + Left.leftString(str, i));
    }
}
class Left{
    public static String leftString(String str, int n){
        return str.substring(0,n);
    }
}
