package testpack;

public class ATM {
	public void withDrawMoney(int amt)
				throws BalanceException {
		int balance=1000;
		if(amt>1000) {
			throw new 
			BalanceException();
		}
	}
}
