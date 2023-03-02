package lesson;
import java.util.Arrays;
import java.util.Random;

public class less1 {
	public static void main(String[] args) {
		Integer[] arr = newArr(10);
		Integer[] result= new Integer[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result = append(result, arr[i]);
			}
		}
		printArr(arr);
		printArr(result);
	}

	private static Integer[] append(Integer[] arr, int element) {
		Integer[] array = new Integer[arr.length + 1];
		System.arraycopy(arr, 0, array, 0, arr.length);
		array[arr.length] = element;
		return array;
	}

	public static Integer[] newArr(int n) {
		Integer[] arr = new Integer[n];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		return arr;
	}
	public static void printArr(Integer[] arr){
		System.out.println(Arrays.toString(arr));
	}
}
