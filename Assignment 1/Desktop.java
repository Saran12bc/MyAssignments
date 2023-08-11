package week3day1;

public class Desktop extends Computer{

		public void DesktopSize() {
			System.out.println("Desktop size is 18 inches");
		}
		public static void main(String[] args) {

			Desktop cc=new Desktop();
			cc.ComputerModel();
			cc.DesktopSize();

		}

	}