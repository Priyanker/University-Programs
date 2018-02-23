/*
Given a sentence check if it is a panagram or not if panagram print 1 else print -1

A pangram is a sentence which contains every letter of a alphabet at least once


input =the quick brown fox jumps over the lazy dog
output = 1

Explanation - The above sentence contains all the alphabets (a-z) atleast once.


input =pack my box with five dozen liquor jugs
output = 1
*/
import java.util.*;
class AllAlphabets
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        List<Character> list = new ArrayList<>();
        String s1=s.replaceAll("\\s","");
        for(int i=0;i<s.length();i++)
        {
            list.add(s1.charAt(i));
        }
        Collections.sort(list);
        Boolean isTrue=true;
        if(s.length()<26)
        {
        	isTrue=false;
        }
        else
        {
            char c ='a';
            for(int i=0;i<list.size();i++)
            {
                if(!(list.contains(c)))
                {
                    isTrue=false;
                    break;
                }
                c++;
            }   
        }
        if(isTrue)
        {
        	System.out.println("1");
        }
        else
        {
        	System.out.println("-1");
        }
        /*
        System.out.print("1");
        */
    }
}