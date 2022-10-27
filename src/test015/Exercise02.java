package test015;

public class Exercise02 {
	public static void main(String[] args) {
		HomeLetter homeLetter = new HomeLetter("小明", "外婆", "我在北京一切都好，勿念","2022-10-19");
		homeLetter.view();
		
		LoveLetter loveLetter = new LoveLetter("小明", "小薇", "我在北京一切都好，勿念","2022-10-19");
		loveLetter.view();
		
	}
}

interface Letter{
	void writeHeader();
	void writeBody();
	void writeFooter();
}

class Content{
	private String name;
	private String header;
	private String body;
	private String floot;
	
	public Content(String name, String header, String body, String floot) {
		super();
		this.name = name;
		this.header = header;
		this.body = body;
		this.floot = floot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFloot() {
		return floot;
	}

	public void setFloot(String floot) {
		this.floot = floot;
	}
	
	

}

class HomeLetter extends Content implements Letter{

	
	public HomeLetter(String name, String header, String body, String floot) {
		super(name, header, body, floot);
	
	}
	@Override
	public void writeHeader() {
		System.out.println( "敬爱的" + getHeader());
	}
	@Override
	public void writeBody() {
		System.out.println("      您好！" + getBody());
	}
	@Override
	public void writeFooter() {
		System.out.println("\t\t" + getName() + getFloot());
	}
	public void view() {
		writeHeader();
		writeBody();
		writeFooter();
		
	}
	
}
class LoveLetter extends Content implements Letter{
	
	public LoveLetter(String name, String header, String body, String floot) {
		super(name, header, body, floot);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeHeader() {
		System.out.println("亲爱的" + getHeader());
	}
	@Override
	public void writeBody() {
		System.out.println("    你好！" + getBody());
	}
	@Override
	public void writeFooter() {
		System.out.println("\t\t" +  getName() + getFloot());
	}
	public void view() {
		writeHeader();
		writeBody();
		writeFooter();
		
	}
}