package week3day1;

public class Axisbank extends BankInfo {

	
	public int deposit(int a,int b) {
		System.out.println("Deposited Amount");
		return a+b;
	}
	
	
	public static void main(String[] args) {
	
		Axisbank cc1=new Axisbank();
	
		int deposit =cc1.deposit(10,20);
	System.out.println(deposit);
	

	}

}
