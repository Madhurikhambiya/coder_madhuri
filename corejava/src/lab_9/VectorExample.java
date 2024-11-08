package lab_9;


import java.util.Vector;

public class VectorExample { 
	public static void main(String[] args) {
		Vector<Integer>numbers=new Vector<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println("original Vector :" + numbers);
		
		numbers.remove(2);
		numbers.add(2,35);
		
		System.out.println("modified Vector :" + numbers);
		
		boolean contains40 = numbers.contains(40);
		System.out.println("Does the Vector contain '40? " + contains40);
		
		numbers.clear();
		System.out.println("Final Vector : "+ numbers);
	}

}