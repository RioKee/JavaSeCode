package test016.java;

/**
 * ����������Ψ�����
 *
 * @author:kee
 */
public class LoopContent {
    public static void main(String[] args) {
        loop("��黨�㻨����");
        loop("���ֿ���");
    }
    public static boolean loop(String str){
        StringBuffer sr = new StringBuffer(str);
        sr.reverse();
        if(str.equals(sr.toString())){
            System.out.println(str + " >>> �ǻ���");
            return true;
        }else {
            System.out.println(str + " >>> ���ǻ���");
        }
        return false;
    }
}
