package test017.java;



public class IntegerExercise {
    public static void main(String[] args) {
        
        int num = 66;
        String s = num + "";
        System.out.println(s);
        
        //×Ô¶¯×°Ïä ²ğÏä
        System.out.println(s.length());
        
        int a = Integer.valueOf(s);
        Integer num1 = new Integer(a);
    }

}
