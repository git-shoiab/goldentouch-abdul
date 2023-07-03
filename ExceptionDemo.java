package testpack;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("first line..");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(NumberFormatException ee) {
			ee.printStackTrace();
			System.out.println("please enter a number rather than a text");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Please pass a command line argument..");
		}
		catch(Exception e) {
			System.out.println("solve it I dont know the problem");
		}
		System.out.println("second line..");
	}
}
