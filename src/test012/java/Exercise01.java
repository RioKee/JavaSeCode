package test012.java;

public class Exercise01 {
    public static void main(String[] args) {
        boolean b = true;
        int t = b ? 1:0;   //使用三目运行符，转换数据类型
        System.out.println(t);

        String str = "hello";
        System.out.println(str.substring(0,5));

        String str2 = "";
        String str3 = null;
        System.out.println("str2:" + str2);
        System.out.println("str2length:" + str2.length());
        System.out.println("str3:" + str3);
//        System.out.println("str3.length:" + if(str3.length()==0));
        //字符串的"" 和  null  区别： "" 的内容为空，长度为0     null 的内容为null ，不能输出长度



    }
}
