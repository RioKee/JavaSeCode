package test016.java.homework;

import java.util.Scanner;

/**
 * ����������Ψ�����
 *
 * @author:kee
 */
public class HomeWork01 {
    public static void main(String[] args) {
        HomeWork hm = new HomeWork();
        boolean loop = true;
        do {
            if(hm.func()){
                loop = false;
            }else {
                System.out.println("�������ύ����ȷ�����˳�");
            }

        }while(loop);


//        System.out.println(hm);
    }
}
/**
 * �ַ���String
 * ʹ����ҵ�ύϵͳ�ύJava��ҵ������javaԴ�����ļ�����
 * �������Լ������䣬�ύǰ��Java�ļ����Լ�������Ч�Խ��м�顣
 * ����ʵ��
 * ��ʾ��
 * 1.	�Ϸ����ļ�����.���ڣ�.�����ڿ�ͷ��Ӧ����java��β
 * 2.	�Ϸ�������������Ҫ������@���͡�.��, ����顰@���Ƿ��ڡ�.��֮ǰ
 */
class HomeWork{
    private String fileName;
    private String email;

    public boolean checkName(String str){
        int len = str.length();
        if (len <= 5){  // ���г���У��
            System.out.println("\n�ļ��ĸ�ʽ����ȷ��(���ȴ���)");
            return false;
        }
        String suffix = str.substring(len - 5, len);
        if(!suffix.equals(".java")){  // У���ļ���׺��
            System.out.println("��������ȷ�ĺ�׺(.java)�ļ�");
            return false;
        }
        if(str.charAt(0) == '.'){  // '.' �������ļ���ͷ
            System.out.println("'.' �������ļ���ͷ");
            return false;
        }
        System.out.println("�ļ�������ȷ");
        return true;
    }

    public boolean checkEmail(String str){
        int len = str.length();
        if(len <= 6){
            System.out.println("���볤������(����)");  //1@q.com
            return false;
        }

        String suffix = str.substring(len-4, len);
        if(!".com".equals(suffix)){
            System.out.println("��β���������β������(.com)");
            return false;
        }
        if(str.charAt(0) == '@'){
            System.out.println("'@' ���������俪ͷ");
            return false;
        }
        if(str.indexOf("@") == -1){
            System.out.println("����������'@'");
            return false;
        }
        if(str.substring(len-5, len-4).equals("@")){
            System.out.println("@ �� . ֮�������ڵ�ַ");
            return false;
        }

        System.out.println("����������ȷ");
        return true;
    }
    public boolean func(){
        System.out.print("�������ļ�����");
        fileName = new Scanner(System.in).next();
//        fileName = "Demo.java";
       checkName(fileName);

        System.out.print("���������䣺");
        email = new Scanner(System.in).next();
//        email = "luck@qq.com";
        return checkEmail(email) && checkName(fileName);
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "fileName='" + fileName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}