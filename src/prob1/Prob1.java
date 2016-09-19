package prob1;

public class Prob1 {

	public static void main(String args[]) {

		char[] array1 = reverse("Hello World");
		printCharArray(array1);

		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);

	}

	public static char[] reverse(String str) {
		char[] c = str.toCharArray();
		

		for (int i = 0; i < c.length; i++) {
			
			char charArray = c[i + c.length - 1];
			
		}
		return c;
	}

	public static void printCharArray(char[] array) {
		char[] array3 = 
		System.out.println(array3[]);
	}
}
