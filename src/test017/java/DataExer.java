package test017.java;
import java.util.Date;
//import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataExer {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(System.currentTimeMillis());
		System.out.println(date.getTime());
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		Integer a = 128;
		int num = 33;
		Integer b = 128;
		a.getClass();
		
		System.out.println(a == b);
		
		
		
	}
}
