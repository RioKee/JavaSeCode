package test016.java.homework;

import java.util.Scanner;

/**
 * 我亦无他，唯手熟尔
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
                System.out.println("请重新提交，正确才能退出");
            }

        }while(loop);


//        System.out.println(hm);
    }
}
/**
 * 字符串String
 * 使用作业提交系统提交Java作业，输入java源代码文件名，
 * 并输入自己的邮箱，提交前对Java文件名以及邮箱有效性进行检查。
 * 编码实现
 * 提示：
 * 1.	合法的文件名：.存在，.不能在开头，应该以java结尾
 * 2.	合法的邮箱名：至要包含“@”和“.”, 并检查“@”是否在“.”之前
 */
class HomeWork{
    private String fileName;
    private String email;

    public boolean checkName(String str){
        int len = str.length();
        if (len <= 5){  // 进行长度校验
            System.out.println("\n文件的格式不正确，(长度错误)");
            return false;
        }
        String suffix = str.substring(len - 5, len);
        if(!suffix.equals(".java")){  // 校验文件后缀名
            System.out.println("请输入正确的后缀(.java)文件");
            return false;
        }
        if(str.charAt(0) == '.'){  // '.' 不能再文件开头
            System.out.println("'.' 不能在文件开头");
            return false;
        }
        System.out.println("文件输入正确");
        return true;
    }

    public boolean checkEmail(String str){
        int len = str.length();
        if(len <= 6){
            System.out.println("输入长度有误(大于)");  //1@q.com
            return false;
        }

        String suffix = str.substring(len-4, len);
        if(!".com".equals(suffix)){
            System.out.println("结尾错误，邮箱结尾必须是(.com)");
            return false;
        }
        if(str.charAt(0) == '@'){
            System.out.println("'@' 不能在邮箱开头");
            return false;
        }
        if(str.indexOf("@") == -1){
            System.out.println("邮箱必须包含'@'");
            return false;
        }
        if(str.substring(len-5, len-4).equals("@")){
            System.out.println("@ 和 . 之间必须存在地址");
            return false;
        }

        System.out.println("邮箱输入正确");
        return true;
    }
    public boolean func(){
        System.out.print("请输入文件名：");
        fileName = new Scanner(System.in).next();
//        fileName = "Demo.java";
       checkName(fileName);

        System.out.print("请输入邮箱：");
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