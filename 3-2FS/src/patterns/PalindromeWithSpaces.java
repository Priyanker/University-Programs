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
package patterns;
import java.util.*;
class PalindromeWithSpaces
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder temp = new StringBuilder(s);
        
        for(int i=0;i<s.length();i++)
        {
            if(temp.charAt(i)==' ')
            {
                temp.deleteCharAt(i);
            }
        }
        System.out.println(temp);
    }
}