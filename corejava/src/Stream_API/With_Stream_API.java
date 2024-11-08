package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class With_Stream_API {
	public static void main(String[] args) {
		List<Product_list> li = new ArrayList<>();
		
		li.add(new Product_list(1,"jeans",3500));
		li.add(new Product_list(2,"shirt",300));
		li.add(new Product_list(3,"jacket",350));
		li.add(new Product_list(4,"top",356));
		li.add(new Product_list(5,"bag",3500));
		
		int sum = 0;
		
		List<Integer>list = li.stream().filter(p->p.prize>3000).map(p->p.prize).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer>listtoprize = new ArrayList<>();
		Integer total = li.stream().filter(p->p.prize>3000).peek(p->listtoprize.add(p.prize)).mapToInt(pp->pp.prize).sum();
		System.out.println(total);
	}

}
