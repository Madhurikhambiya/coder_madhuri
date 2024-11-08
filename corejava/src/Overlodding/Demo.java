package Overlodding;

public class Demo {
 
	
	public static  int haiComputerSumKaro(int a  , int b) {
		return a+b ;
    }

     // over-loding is a same name but different parameter that is a over-lodding.
     //  it is a compile-time polymor-phism
     
	public static  int haiComputerSumKaro(int a  , int b , int c) {
	      return a+b+c;
    }

    public static  void haiComputerSumKaro() {
           System.out.println("kuch nahi hai ");
    }


    public static void main(String[] args) {
	
	     int h  = 12  ;
	     int u  = 89  ;
	     int gg  = 70 ;
	
	     int c   = haiComputerSumKaro(h , u) ;
	
	     haiComputerSumKaro() ;
	
	     int p  = haiComputerSumKaro(h ,u  , gg) ;
	
	
	     System.out.println(p);
	
	
	
	     System.out.println(c);
	
}

}

