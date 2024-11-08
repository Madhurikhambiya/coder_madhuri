package lab_11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	public static void main(String[]args) {
		//Array of collableA objects with different value of n
		
		CallableA[]arr = {
				new CallableA(29),
				new CallableA(65),
				new CallableA(1),
				new CallableA(44),
				new CallableA(76),
				new CallableA(7),
				
				
		};
		
		//ExecutorService a fixed thread pool of size 3 to execute callableA object concurrently
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(CallableA res : arr) {
			Future f =  service.submit(res);
			
			try {
				System.out.println("sum" + res.getN()+" :" +f.get());
			}catch(InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}
