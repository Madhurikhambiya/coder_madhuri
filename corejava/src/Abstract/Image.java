package Abstract;

public class Image implements Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing image");
		
	}
	public static void main(String[] args) {
		Document d = new Document();
		d.print();
		Image i = new Image();
		i.print();
	}

}
