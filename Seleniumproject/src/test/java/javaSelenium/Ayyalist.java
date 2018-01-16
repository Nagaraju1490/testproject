package javaSelenium;

import java.util.ArrayList;
import java.util.Iterator;


public class Ayyalist {
	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Nagaraju");
		ar.add("Mithun");
		ar.add("Raju");
		ar.add("Nagaraju");
		
		System.out.println("******** using forloop");

		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
		System.out.println("******** using iterator");
		
		Iterator<String> itr= ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("******** using while loop");
		
		int num=0;
		while(num<ar.size()) {
			System.out.println(ar.get(num));
			num++;
		}
	

	}

}
