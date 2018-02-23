import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		String y = scan.nextLine();
		char[] arr1 =x.toCharArray();
		char[] arr2 =y.toCharArray();
		//ArrayList<char[]> ar1 = new ArrayList<char[]>(Arrays.asList(arr1));
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(String.valueOf(arr1));
		System.out.println(String.valueOf(arr2));
		if(String.valueOf(arr1).equals(String.valueOf(arr2)))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
