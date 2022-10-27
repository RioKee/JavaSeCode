package test016.java;

/**
 * 我亦无他，唯手熟尔
 *
 * @author:kee
 */
public class LoopContent {
    public static void main(String[] args) {
        loop("鸟伴花香花伴鸟");
        loop("快乐快乐");
    }
    public static boolean loop(String str){
        StringBuffer sr = new StringBuffer(str);
        sr.reverse();
        if(str.equals(sr.toString())){
            System.out.println(str + " >>> 是回文");
            return true;
        }else {
            System.out.println(str + " >>> 不是回文");
        }
        return false;
    }
}
