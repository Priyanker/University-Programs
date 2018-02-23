import java.util.Scanner;
public class InvertedTrianglePattern
{

	public static void main(String[] args) 
	{
        int i,j,k,n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
	}
}
