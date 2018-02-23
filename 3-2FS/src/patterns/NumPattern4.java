/*
write a program to print the following pattern 

input = 4
output =
12344321
123**321
12****21
1******1


input = 5
output = 
1234554321
1234**4321
123****321
12******21
1********1


input = 6
output =
123456654321
12345**54321
1234****4321
123******321
12********21
1**********1
*/
package patterns;
import java.util.*;
class NumPattern4
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int i,j1,k1,k2,j2;
        for(i=1;i<=n;i++)
        {
            for(j1=1;j1<=n-i+1;j1++)
            {
                System.out.print(j1);
            }
            for(k1=j1;k1<=n;k1++)
            {
                System.out.print("*");
            }
            for(k2=n;k2>n-i+1;k2--)
            {
                System.out.print("*");
            }
            for(j2=n-i+1;j2>=1;j2--)
            {
                System.out.print(j2);
            }
            System.out.println();
        }
    }
}