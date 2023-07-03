package testpack;

public class Child {
	public static void main(String[] args) {
		Dog tiger=new Dog();
		try {
		tiger.play("stick");
		}catch(DogBiteException e) {
			e.printStackTrace();
		}
		System.out.println("finish.");
	}
}
