//Finding the number of unique elements in an integer array.
import java.util.*;
public class NoOfUniqueElements {
	static boolean isUnique(int x, int[] y)
	{
		int count=0;
		for(int i=0;i<y.length;i++)
		{
			if(x==y[i])
			{
				count++;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		int i,un=0,n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		n=scan.nextInt();
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<n;i++)
		{
			if(isUnique(arr[i],arr))
			{
				un++;
			}
		}
		System.out.println(un);
		scan.close();
	}
}
