package testpack;

public class TitanSub {
	public void dive(int depth)throws Exception {
		if(depth>1350) {
			throw new 
			IllegalStateException("Not allowed...");
		}
	}
}
