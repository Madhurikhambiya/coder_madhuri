package Abstract;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
	Demo(){
		System.out.println("hello i am Demo");
	}
	public static void main(String[] args) {
		FunInterface obj = (int x)->System.out.println("hello");
		obj.show(3);
		
		Consumer<String> c =(value1)->System.out.println(value1);
		c.accept("Madhuri");
		
		BiConsumer<Integer,Integer>consumer = (value,value1)->System.out.println(value);
		consumer.accept(5,7);
		
		Predicate <Integer> Pre = (value)->value!=null;
		System.out.println(Pre.test(3));
		
		Predicate<String> Pre1 = (value)->value.contains("Chintu");
		System.out.println(Pre1.test("Chintu is best"));
		
		Function<Integer,Boolean> Fun = (value)->value!=0;
		System.out.println(Fun.apply(4));
		
		Supplier<Integer> Sup = ()->7;
		System.out.println(Sup.get());
		
		Runnable r = ()->System.out.println("i am runnable");
		Thread t = new Thread(r);
		t.start();
		
		Consumer<String> consumer1 = FunInterface2 :: show;
		
		new Demo();
		
		
		
		
		
	}

}
