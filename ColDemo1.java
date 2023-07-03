package testpack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColDemo1 {
	public static void main(String[] args) {
		List list=new LinkedList();
		System.out.println(list.size());
		list.add(10);
		list.add("hello");
		list.add(new ATM());
		list.add(10.34f);
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.remove(1);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(Object i:list) {
			System.out.println(i);
		}
	}
}
