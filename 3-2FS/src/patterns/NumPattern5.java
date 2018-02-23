package patterns;
/*
write a program to print the following pattern 


input = 4
output =
1
2 3 2
4 5 6 5 4
7 8 9 10 9 8 7

input = 5
output =
1
2 3 2
4 5 6 5 4
7 8 9 10 9 8 7
11 12 13 14 15 14 13 12 11
*/
import java.util.*;
class NumPattern5
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=0,j=0,k=0,count=0, temp=0;
        int sumCount=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(++k +" ");
            }
            temp=k;
            for(int j1=j;j1<=i+sumCount;j1++)
            {
                System.out.print(--temp + " ");
            }
            System.out.println();
            sumCount++;
        }
        
    }
}