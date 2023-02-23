public class Converter {

	public static void main(String[] args) {
			System.out.println("Наибольшее из чисел = " + findMax());
	}
	
	public static int findMax() {
		  int a = 5;
			int b = 3;
			if (a > b) {
				return a;
			} 
			return b;
	}

}