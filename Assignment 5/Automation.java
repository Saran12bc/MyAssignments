package week3day1;

public class Automation extends MultipleLangauge implements TestTool,Language{

	public static void main(String[] args) {
		
		Automation cc=new Automation();
		cc.Java();
		cc.ruby();
		cc.Selenium();
		cc.python();

	}
	

	@Override
	public void python() {
		System.out.println("from obstract class");
		
	}


	@Override
	public void ruby() {
		System.out.println("from obstract class +unimplemented method");
	}


	public void Java() {
System.out.println("interface:1");
		
	}

	public void Selenium() {
		System.out.println("interface:2");
		
	}

}
