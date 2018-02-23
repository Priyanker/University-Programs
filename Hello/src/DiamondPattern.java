import java.util.Scanner;
public class DiamondPattern {
	public static void main(String[] args) {
		int i,j,k,n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=j;k<=n;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=j;k<=n;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
