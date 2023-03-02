package dz2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя
 * количество выполняемых действий к минимуму.
 * Пример 1: а = 3, b = 2, ответ: 9
 * Пример 2: а = 2, b = -2, ответ: 0.25
 * Пример 3: а = 3, b = 0, ответ: 1
 * Пример 4: а = 0, b = 0, ответ: не определено
 * Пример 5
 * входные данные находятся в файле input.txt в виде
 * b 3
 * a 10
 * Результат нужно сохранить в файле output.txt
 * 1000
 */
public class Main {
	public static String inputFile = "/dz2/input.txt";
	public static String outputFile = "/dz2/output.txt"; 
	public static void main(String[] args) throws Exception {

		String[] arr = readFile(inputFile);
		Integer[] arrInt = strArrToIntArr(arr);
		Double result = stepen(arrInt[0], arrInt[1]);
		writeFile(resultСonversion(result),outputFile);
		System.out.println("\nCalculation performed!\n");
	}

	public static String resultСonversion(Double result) {
		String temp = "";
		if (result % 1 == 0) {
			temp = String.valueOf(result.intValue());
		} else {
			temp = String.valueOf(result);
		}
		return temp;
	}

	public static Integer[] strArrToIntArr(String[] arr) {
		Integer[] result = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].substring(2);
			result[i] = Integer.parseInt(arr[i]);
		}
		return result;
	}

	public static void writeFile(String string,String nameFile) throws FileNotFoundException {
		String pathProject = System.getProperty("user.dir");
		String pathFile = pathProject.concat(nameFile);
		File file = new File(pathFile);
		PrintWriter pw = new PrintWriter(file);
		pw.println(string);
		pw.close();
	}

	public static String[] readFile(String nameFile) throws Exception {
		String pathProject = System.getProperty("user.dir");
		String pathFile = pathProject.concat(nameFile);
		File file = new File(pathFile);
		Scanner scan = new Scanner(file);
		String[] array = {};
		while (scan.hasNextLine()) {
			array = append(array, scan.nextLine());
		}
		scan.close();
		return array;
	}

	public static String[] append(String[] arr, String element) {
		String[] array = new String[arr.length + 1];
		System.arraycopy(arr, 0, array, 0, arr.length);
		array[arr.length] = element;
		return array;
	}

	public static Double stepen(int a, int b) {
		return Math.pow(a, b);
	}
}
