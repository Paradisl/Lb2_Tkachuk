package Lb2_Tkachuk;
import java.util.Scanner;

public class Main {
	public static boolean ed(String input) {
		return input.endsWith("ed");
	}
	
	public static int stringNumbers(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++)  {
			if (Character.isDigit(input.charAt(i))) {
				sum += Integer.parseInt(String.valueOf(input.charAt(i)));
			}
		}
		return sum;
	}
	
	public static int blockLength(String input) {
		int max = 0;
		int comparable = 0;
		char first = input.charAt(0);
		for(int i=0;i< input.length();i++){
		   if(input.charAt(i) == first){
			comparable++;
		   } else {
			first = input.charAt(i);
			comparable = 1;
		   }
		  if(comparable>max){
			max = comparable;
		  } 
		}
		return max;
	}
	
	public static void wordsInLength(String input) {
		String[] words = input.split(" ");
		for (String word : words){
			System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inpus string(ed)");
		String firstTask = scanner.nextLine();
		System.out.println(ed(firstTask));
		
		System.out.println("Input a string with numbers");
		String secondTask = scanner.nextLine();
		System.out.println(stringNumbers(secondTask));
		
		System.out.println("Input string");
		String thirdTask = scanner.nextLine();
		System.out.println(blockLength(thirdTask));
		
		System.out.println("Input string");
		String fourthTask = scanner.nextLine();
		wordsInLength(fourthTask);
	}
}