/*
Write a program to print all the LEADERS in the array. 
An element is leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader. 

input = 
6
16 17 4 3 5 2
output =
17 5 2


First line contains the size of the array followed by array elements
*/
import java.util.*;
class Leaders
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(isLeader(arr[i],arr,i))
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[n-1]);
    }
    static boolean isLeader(int x, int[] arr, int index)
    {
        int count=0;
        for(int i=index+1;i<arr.length;i++)
        {
            if(x<arr[i])
            {
                return false;
            }
        }
        return true;
    }
}