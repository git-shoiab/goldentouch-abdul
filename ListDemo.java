package testpack;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListDemo {
	public static void main(String[] args) {
		Question q1=new Question(
			"1. Capital of TamilNadu",
			"kasimedu",
			"Triplcane","chennai",3
		);
		Question q2=new Question(
				"2.Capital of India",
				"kosuppetu",
				"delhi","padappai",2
			);
		Question q3=new Question(
				"3.Capital of Nepal",
				"madhavaram",
				"chennai","katmandu",2
			);
		List questionset=new LinkedList();
		questionset.add(q1);
		questionset.add(q2);
		questionset.add(q3);
	
	Random random=new Random();
	for(int i=0;i<2;i++) {
		int next=random.nextInt(3);
		if(next!=0) {
			 System.out.println
			 (questionset.get(next));			
		}
		else {
			i--;
		}

	}
	}
}
class Question{
	String q,o1,o2,o3;
	int ans;
	public Question(
		String q,String o1,String o2,
		String o3,int ans
			) {
		this.q=q;this.o1=o1;this.o2=o2;
		this.o3=o3;this.ans=ans;
		
	}
	public String toString() {
		return q+"\n 1."+o1+"\n 2."+o2+
		"\n 3."+o3;
	}
}