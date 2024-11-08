package Data_Structure; 

//A Stack is a genri-c data Structure that represents a LIFO(last in ,First out).
//collection of object allowing for pushing/popping elements in constant time(value). 

import java.util.*;

 //stack implimen-tation  using  array in java method of push, pop,and  peek.
//top to bottom element.

public class Stack { 
	
	static final int Max = 1000 ;
	int top ;
	int arr[] = new int[Max] ;
	
	boolean  isEmpty() { 
		
		//if(top<0) {
			//return true ;
		//}
		//else {
			//return false ;
		//} 
		return top<0 ; //single line logic
	} 
	Stack(){
		top = -1 ;
	} 
	boolean push (int x) {
		if(top>=Max) {
			System.out.println("Stack overflow");
			return false ;
		}
		arr[++top] = x ;
		System.out.println("value pushed into  stsck successfully ");
		return true ;
	}  
	int pop() {
		if(top<0) { 
			System.out.println("Stack underflow");
			
			return 0;
		}
		return arr[top--] ;
	}
	int peek() {  
		//if(top<0) {
			//System.out.println("Stack under flow"); 
			//return 0 ;
		//}
		
		return arr[top] ;
	} 
	void print() {
		for(int i = top ; i >= 0 ; i--) {
			System.out.println(arr[i]+"");
		}
	}
	
	public static void main(String[] args) { 
		Stack st = new Stack(); // top = -1
		
		st.push(12);
		
		st.push(23);
		
		st.push(34);
		
		st.push(24);
		
		System.out.println(st.pop());
		
		System.out.println("top element" + st.peek()); 
		
		st.print();
		
	}

}



