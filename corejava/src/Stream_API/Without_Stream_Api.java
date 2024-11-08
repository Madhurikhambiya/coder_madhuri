package Stream_API;

import java.util.ArrayList;
import java.util.List;

public class Without_Stream_Api {
	public static void main(String[] args) {
		System.out.println("Without stream api");
		
		List<Product_list>li = new ArrayList<>();
		li.add(new Product_list(1,"jeans",3400));
		li.add(new Product_list(2,"shirt",300));
		li.add(new Product_list(3,"top",400));
		li.add(new Product_list(4,"bag",3000));
		li.add(new Product_list(5,"voalet",3400));
		
		int sum = 0;
		
		for(Product_list i: li) {
			if(i.prize>3000) {
				System.out.println("List iteam :"+i.item + " list prize :"+i.prize);
				sum = sum + i.prize;
			}
		}
		System.out.println("total sum = "+ sum);
	}

}
