package patterns;
import java.util.Scanner;
public class NumPattern1 {
	public static void main(String[] args) {
		int i,j,k,count=0,n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				count++;
			}
		}
		for(i=1;i<=n;i++)	//for(i=n;i>=1;i++)
		{
			k = count-n+i;	//k=count-i+1;
			for(j=n;j>=i;j--)
			{
				System.out.print(k++ + " ");
				count--;
			}
			System.out.println();
		}
		scan.close();
	}
}
