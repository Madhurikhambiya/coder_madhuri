package lab_19;

public class MethodReferences {
	public static int square(int num) {
		return num*num;
	}
	public static void main(String[] args) {
		CalculateSquare calcu = MethodReferences ::square;
		System.out.println(calcu.square(6));
	}

}
