package test016.java.homework;

import java.util.Scanner;

/**
 * ����������Ψ�����
 *
 * @author:kee
 */
public class HomeWork02 {
    public static void main(String[] args) {
         LoginSystem loginSystem = new LoginSystem();
        System.out.print("�������˺�:");
        String user = new Scanner(System.in).next();
        System.out.print("����������:");
        String pwd = new Scanner(System.in).next();
        loginSystem.view(user, pwd);

    }
}
/**
 * �û���¼��֤��
 *   �����û����������ж��Ƿ��¼�ɹ���
 *   Ҫ��
 *   ֻ���û��� �� ���붼��ȷ���ܵ�¼�ɹ�������ʧ�ܡ�
 *   ԭʼ�û���������ֱ��ǣ�'admin', '000000'
 */

class LoginSystem{
    private String userName = "admin";
    private String password = "000000";
    private boolean u = false;
    private boolean p = false;

    public void login(String user, String pwd){
        if(!userName.equals(user)){
            u = true;
        }
        if(!password.equals(pwd)){
            p = true;
        }
    }

    public void view(String user, String pwd){
        login(user, pwd);
        if(u){
            System.out.println("�˺��������");
        }
        if(p){
            System.out.println("�����������");
        }
        if(u == false && p == false){
            System.out.println("�ɹ�");
        }
    }

}