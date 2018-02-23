/*
Find the maximum length of the largest subarray from an array with a given sum. 
Return -1 if no subarray is found with that sum. 
Array will contain postivie integers ,might not necessariyly be distinct, Array will be non empty.

Subarray is defined as a contiguous section of an array.

Explanation for contiguous arrays: In an array {2,3,4,5,6} 
{4,5} is a subarray as it comprises of indices {2,3} .
{2,6} is not a subarray because the indices are not contiguous.

Input format 
First line will carry int n length of array , 
next n lines will be carrying elements of array 
last line will cary sum value

output format
largest value if exists a sub array or -1

input =
5
7
3
4
1
10
7
output 
2

Explanation :-
There are two subarrays here {7} {3,4} with sum 7. 
Second has length maximum length i.e., 2 so answer is 2


*/
import java.util.*;
class SubArrayMaxSum
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int sum=0,rsum,maxLen=0;
        n = scan.nextInt();
        int[] arr= new int[n];
        int[] maxArr;
        boolean res=false;
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        rsum=scan.nextInt();
        for(int i=0;i<n-1;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum==rsum && maxLen<j-i+1)
                {
                    maxArr=give(arr,i,j);
                    maxLen=maxArr.length;
                    res=true;
                }
            }
        }
        if(res)
        {
            System.out.println(maxLen);
        }
        else
        {
            System.out.println("-1");
        }
        scan.close();
    }
    static int[] give(int[] tArr, int x, int y)
    {
        int[] temp= new int[y-x+1];
        for(int i=x,j=0;i<=y;i++,j++)
        {
            temp[j]=tArr[i];
        }
        return temp;
    }
}
