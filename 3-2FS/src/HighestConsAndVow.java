/*
Write a program to read a sentence and print the words with highest number of consonants and vowels
if two or more words consists of same count of consonants or vowels 
print all the words with the highest consonant in the order they occur

First print the consonant words followed by vowel

input =keshav memorial institute of technology
output = 
technology
memorial
institute

explanation - 
in the above words the count of consonants and vowels is as follows 

                con  vow
keshav       4     2
memorial    4     4
institute     5     4
of              1     1
technology  7    3

Among these highest consonants count is technology which is 7 and 
highest vowel count is memorial and institute so print both the words


input =keshav memorial engineering college
output =
enginerring
enginerring

in the above test cases engineering has the highest count of consonants and vowels so print the word two times


input =i am good at coding
output =
coding
good
coding

Explanation

in the above test case 
            c               v
i           0               1
am        1               1
good     2              2
at         1               1
coding   4              2
*/
import java.util.*;
class HighestConsAndVow
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = s.split(" ");
        int max = 0, count=0,index=0;
        List<String> list = new ArrayList<String>();
        for(int i=0;i<arr.length;i++)
        {
            count=consonant(arr[i]);
            if(count>max)
            {
                max=count;
                index=i;
                list.clear();
                list.add(arr[i]);
            }
            else if(count==max)
            {
                list.add(arr[i]);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        list.clear();
        count=0;
        max=0;
        for(int i=0;i<arr.length;i++)
        {
            count=vowel(arr[i]);
            if(count>max)
            {
                max=count;
                index=i;
                list.clear();
                list.add(arr[i]);
            }
            else if(count==max)
            {
                list.add(arr[i]);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        
    }
    static int consonant(String x)
    {
        int count=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u')
            {
                
            }
            else
            {
                count++;
            }
        }
        return count;
    }
    static int vowel(String x)
    {
    	int count=0;
    	for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u')
            {
                count++;
            }
            else
            {
            }
        }
        return count;
    }
}
