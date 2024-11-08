package Data_Structure;

public class Recursionbasic {
	public static int factorialFind(int g) { //5
		if(g==0) {
			return 1;
		}else {
			return  g * factorialFind(g-1); // 5*24 or that is a factorialFind(g-1...4)
			//4*6 factrialFind (3)
			//3*2 factrialFind (2)
			//2*1 factorialFind (1)

		}
		
	}
	public static void main(String[] args) {
		//5*4*3*2*1 = 120       
		
		int ans = factorialFind(5);
		System.out.println("factorialfind number  : " +  ans);
		
	}

}
