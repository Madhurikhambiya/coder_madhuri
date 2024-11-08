package lab_11;

import java.util.concurrent.Callable;

//callabel  class takes an integer n  as a parameter

public  class Callabel implements Callable {
	int n;
	
	//parameter constructor
	public Callabel(int n) {
		this.n=n;
	}
	//method to get current n value
	
	public int getN() {
		return this.n;
	}
	//overriding call method calculates sum first N natural numbers
	
	@Override
	public Object call() throws Exception {
		int sum = 0;
		
		for(int i=1;i<=n;i++)
			sum+=n;
		
		return sum;
	}
	
	
	

}
