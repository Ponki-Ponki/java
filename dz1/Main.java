import java.util.Scanner;
public class Main {
	public static class variabl {
		public static Scanner iScanner = new Scanner(System.in);
		public static String quesStr = "Введите значение n: ";
	}
	
    public static void main(String[] args) {
		int n = scanConsol();
		Integer sum = sumTriange(n);
		printConsol(Integer.toString(sum));  
	}

	public static Integer sumTriange(Integer n){
		Integer sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static Integer scanConsol(){
		printConsol(variabl.quesStr);
		int num = 0;
        if (intOrStr()) {
			num = variabl.iScanner.nextInt();
		}
		variabl.iScanner.close();
		return num;
	}

	public static boolean intOrStr(){
		return variabl.iScanner.hasNextInt();
	}

	public static void printConsol(String s){
		System.out.println(s);
	}
    
}