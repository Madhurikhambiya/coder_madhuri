package practies_Dsa;

public class Armstrong_Number {
	public static void main(String[] args) {
		//int num = 123; //123 is not a Armstrong number
		int num = 371;   //371  is an Armstrong number
		
		if(Armstrong (num)) {
			System.out.println(num  + "  is an Armstrong number");
			
		}else {
			System.out.println(num + " is not an Armstrong number");
		}
	}
	public static boolean Armstrong(int num) {
		int sum = 0;
		int temp = num;
		int digitCount = String.valueOf(num).length();
		while(temp!=0) {
			int digit = temp % 10;
			sum +=(int)Math.pow(digit,digitCount );
			temp/=10;
		}
		return sum == num;
		
	}
	
}
	
	