package week3day1;

public class Students {
	
	public void getStudentInfo() {
		System.out.println("Overloading Base Method :Student Information:");
	}
	public void getStudentInfo(int id) {
		System.out.println("Overloading 01:ID:"+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Overloading 02:Name:"+name);
	}
	public void getStudentInfo(int id, String name,String Email) {
		System.out.println("Overloading 03:ID+NAme+email:"+id+name+Email);
	}

	public static void main(String[] args) {
		
		Students cc = new Students();
		cc.getStudentInfo();
		cc.getStudentInfo(112);
		cc.getStudentInfo(123,"saranya");
		cc.getStudentInfo(154,"saranya","dsa@gmail.com");
		

	}

}