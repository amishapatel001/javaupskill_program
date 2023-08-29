package Demo2;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   HashMap<String, Character> map = new HashMap<>();

		   

	        // Adding elements to the Map
	        // using standard put() method
	        map.put("Ravi", 'A');
	        map.put("Amisha", 'C');
	        map.put("Pankaj", 'D');
	        map.put("Akshay", 'F');
	        map.put("Raghav", 'B');

	 

	        System.out.println("Original Hashmap is : " + map);

	 

	        Character ch = map.remove("Akshay");

	 

	        System.out.println("Removed value : " + ch);

	 

	        System.out.println("Updated Hashmap : " + map);
	}
}



