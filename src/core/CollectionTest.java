package core;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Type safe collection
		ArrayList<String> ary = new ArrayList<String>();
		ary.add("Avinash");
		ary.add("Roshan");
		ary.add("Rohan");

		System.out.println(ary);
		
		//Untype safe collection
		LinkedList ll = new LinkedList();
		ll.add("Avinash");
		ll.add(true);
		
		System.out.println(ll);
	}

}
