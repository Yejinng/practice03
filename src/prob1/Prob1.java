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
		int length = c.length/2;
		
		for (int i = 0; i < length; i++) {
			char charArray = c[i];
			c[i] = c[c.length -1 -i];
			c[c.length - i -1]= charArray;
		}
		return c;
	}

	public static void printCharArray(char[] array) {
		
		System.out.println(array);
	}
}
