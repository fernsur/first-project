public class Praktikum {

	public static void main(String[] args) {
		int[] numbers = {1, 4, 7, 9}; //массив целых чисел
		String[] letters = {"A", "B", "C", "D"}; // массив строк
		printArray(numbers, letters); // сперва числовой массив, потом строчный, согласно сигнатуре.
	}
	
	public static void printArray(int[] numbers, String[] letters) { // Аргументы метода массив чиссел и массив строк 
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i = letters.length; i > 0; i--) {
			System.out.println(letters[i]);
		}
	}

}