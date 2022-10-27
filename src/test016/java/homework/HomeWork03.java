package test016.java.homework;

/**
 * 我亦无他，唯手熟尔
 *
 * @author:kee
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Input input = new Input();
        String user = "sdfasdfasdf";
        input.checkUserName(user);
    }
}
/**
 * 验证键盘输入的用户名不能为空，长度大于6，不能有数字。
 * 提示：使用字符串String类的相关方法完成
 */
class Input{
    private String userName;

    public void checkUserName(String str){
        userName = str;
        if(str == null){
            System.out.println("用户名不能为空");
            return;
        }
        int len = str.length();
        if(len < 6){
            System.out.println("输入的长度必须大于6");
            return;
        }
        for(int i = 0; i < len; i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 58){
                System.out.println("输入中不能有数字，请重新输入");
                return;
            }
        }
        System.out.println("输入正确");

    }
}