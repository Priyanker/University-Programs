/*
write  a java program to check if given words form a palindrome or not. 
if it is a palindrome print 1 else print -1

assume all the characters of the words are case sensitive


input = abc cb a
output = 1

input = abc cBa
output = -1


input = aabaa
output = 1
*/
import java.util.*;
class PalindromeWithSpaces
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++)
        {
        	if(sb.charAt(i)==' ')
        	{
        		sb.deleteCharAt(i);
        	}
        }
        if(isPalindrome(sb.toString()))
        {
        	System.out.println("1");
        }
        else
        {
        	System.out.println("-1");
        }
    }
    static boolean isPalindrome(String x)
    {
    	StringBuilder sb = new StringBuilder(x);
    	sb.reverse();
    	if(x.equals(sb.toString()))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}