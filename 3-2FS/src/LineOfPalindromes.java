import java.util.Scanner;
public class LineOfPalindromes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		String[] arr = x.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>=2 && isPalindrome(arr[i]))
			{
				System.out.println(arr[i]);
			}
		}
		scan.close();
	}
	static boolean isPalindrome(String x)
	{
		StringBuilder temp = new StringBuilder(x);
		temp.reverse();
		if(x.equals(temp.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
