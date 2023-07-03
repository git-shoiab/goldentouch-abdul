package testpack;

public class User {
	public static void main(String[] args) {
		ATM sbiatm=new ATM();
		try {
		sbiatm.withDrawMoney(2000);
		}catch(BalanceException be) {
			be.printStackTrace();
		}
		System.out.println("finish");
	}
}
