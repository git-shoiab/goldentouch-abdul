package testpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ColDemi2 {
	public static void main(String[] args) {
		List<String> list=
				new ArrayList<>();
		
		list.add("ramu");
		list.add("ramu");
		list.add("adam");
		list.add("bala");
		list.add("somu");
		
//		System.out.println(list);
//		for(String s:list) {
//			System.out.println(s);
//		}
//		Iterator<String> myindex=
//				list.iterator();
//		while(myindex.hasNext()) {
//			System.out.println(myindex.next());;
//		}
		ListIterator<String> myindex2=
				list.listIterator();
		while(myindex2.hasNext()) {
			System.out.println(myindex2.next());
		}
		while(myindex2.hasPrevious()) {
			System.out.println(myindex2.previous());
		}
	}
}
