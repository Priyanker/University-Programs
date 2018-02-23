/*
write a program to print the following pattern 'n'
input = 5
output = 
55555
45555
34555
23455
12345

input = 6
output =
666666
566666
456666
345666
234566
123456
*/
package patterns;
import java.util.*;
class NumPattern2
{
    public static void main (String[] args) {
        int n,i,j,k1,k;
        Scanner scan = new Scanner(System.in);
        n= scan.nextInt();
        for(i=n;i>=1;i--)
        {
            k=i-1;
            for(j=1;j<=n-i;j++)
            {
                System.out.print(++k);
            }
            for(k1=j;k1<=n;k1++)
            {
                System.out.print(n);
            }
            System.out.println();
        }
        scan.close();
    }
}