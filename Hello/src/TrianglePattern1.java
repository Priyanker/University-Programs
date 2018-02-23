import java.util.Scanner;
public class TrianglePattern1 
{
	public static void main(String[] args) 
	{
		int i,j,k,n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
