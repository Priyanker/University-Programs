//Java program to illustate prefering char[] arrays 
//over strings for passwords in Java
import java.util.*;
public class TrianglePattern
{

	public static void main(String[] args) 
	{
        int i,j,k,n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)  //for(k=j;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
	}
}
