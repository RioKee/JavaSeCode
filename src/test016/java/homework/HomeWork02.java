package test016.java.homework;

import java.util.Scanner;

/**
 * 我亦无他，唯手熟尔
 *
 * @author:kee
 */
public class HomeWork02 {
    public static void main(String[] args) {
         LoginSystem loginSystem = new LoginSystem();
        System.out.print("请输入账号:");
        String user = new Scanner(System.in).next();
        System.out.print("请输入密码:");
        String pwd = new Scanner(System.in).next();
        loginSystem.view(user, pwd);

    }
}
/**
 * 用户登录验证。
 *   输入用户名和密码判断是否登录成功。
 *   要求：
 *   只有用户名 和 密码都正确才能登录成功，否则失败。
 *   原始用户名和密码分别是：'admin', '000000'
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
            System.out.println("账号输入错误");
        }
        if(p){
            System.out.println("密码输入错误");
        }
        if(u == false && p == false){
            System.out.println("成功");
        }
    }

}