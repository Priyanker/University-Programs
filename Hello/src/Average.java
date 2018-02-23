/* program to find the average of numbers using varargs

Take average() as instance method and perform average and print average
Take the size of numbers from the user
Read the integer values from the user
Call average() by varargs

NOTE:
if numbers size is 0
print -1

EX;
input = 3
1
2
3
output = 2


*/
import java.util.*;
class Average
{
    int average(int... vargs)
    {
        int sum=0;
        for(int i:vargs)
        {
            sum=sum+i;
        }
        int res=sum/(vargs.length);
        return res;
    }
    public static void main(String[] args)
    {
        Average t=new Average();
        int [] arr;
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        if(n==0)
        {
            System.out.println(-1);
        }
        else
        {
            //int result=Average.average(arr);
            int result=t.average(arr);
            System.out.println(result);
        }
        scan.close();
        
    }
}