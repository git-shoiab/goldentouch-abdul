package testpack;

public class ClassDemo {
	public static void main(String[] args) {
		try {
			Hall obj=(Hall)Class.forName("testpack.Hall").newInstance();
			System.out.println(obj);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Hall{
	
}
class MarriageHall extends Hall{
	
}
class BirthDayHall extends Hall{
	
}