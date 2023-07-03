package testpack;

public class TitanicTourist {
	public static void main(String[] args) {
		TitanSub titan=new TitanSub();
		try {
			titan.dive(9000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("safe return");
	}
}
