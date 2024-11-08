package lab_12; 

import java.util.ArrayList;
import java.util.List;

//generic container class that takes a  type parameter T

public class Container<T> {
	//a private filed to store the collection of object,which can be List<T>
	
	private List<T> objects = new ArrayList<T>();
	
	//adds an object of type T to the collection
	
	public void add(T obj) {
		objects.add(obj);
	}
	
	//remove an object of type T from the collection 
	public boolean remove(T obj) {
		return objects.remove(obj);
	} 
	
	//return the object  specific index in the collection
	
	public T get(int index) {
		return objects.get(index);
	}
	
	//return the number of objection the collection
	
	public int size() {
		return objects.size();
	}
}
