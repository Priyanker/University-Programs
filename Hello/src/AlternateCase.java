import java.util.Arrays;


public class AlternateCase {
	public static void main(String[] args) {
		String x = "hello";
		char[] y;
		y = x.toCharArray();
		String z = Arrays.toString(y);
		System.out.println(z);
		System.out.println(String.valueOf(y));
	}
}
