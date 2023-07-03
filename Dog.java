package testpack;

public class Dog {
	public void play(String item)
			throws DogBiteException {
		if(item.equals("stick")) {
			throw new DogBiteException();
		}
		System.out.println("happy..");
	}
}
