package Demo2;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedList<String> lst = new LinkedList<String>();
	        lst.add("Ganga");
	        lst.add("Yamuna");
	        lst.add("Narmada");

	 

	        System.out.println("List : " + lst);
	        System.out.println();

	 

	        Collections.reverse(lst);
	        System.out.println("Reverse List : " + lst);
	    }

	}

