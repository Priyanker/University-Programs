/* write a program to count the number of characters in a given string and print the output as shown below in sample test cases

     input = aaabbcccddbbaccdcaa
     output = a6b4c6d3

     input = kmit
    output = k1m1i1t1

    input = apple
    output = a1p2l1e1
    
    */
import java.util.*;
class NoOfAlphabets
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i);
        }
       

        char[] characters = getMyCharArray(arr); //The array without duplicates
        //System.out.println(characters);
        for(int i=0;i<characters.length;i++)
        {
        	int count=0;
        	for(int j=0;j<arr.length;j++)
        	{
        		if(characters[i]==arr[j])
        		{
        			count++;
        		}
        	}
        	System.out.print(characters[i]+""+count);
        }
        
        /*
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        //Arrays.sort(arr);
        int count=0;
        char c;
        int j=0;
        for(int i=0;i<arr.length-1;i=j)
        {
            c=arr[i];
            System.out.println(c);
            count=0;
            //System.out.println(c);
            while(arr[j]==arr[i])
            {
                count++;
                j++;
            }
            h.put(c,count);
        }
        
        for(Map.Entry<Character, Integer> entry: h.entrySet())
        {
            System.out.print(entry.getKey()+""+entry.getValue());
        }
        */
  
 
        
    }
    static char[] getMyCharArray(char[] array) {
        StringBuilder myArray = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            if(myArray.toString().indexOf(array[i]) == -1) // check if a char already exist, if not exist then return -1
                myArray.append(array[i]);      // add new char
        }
        return myArray.toString().toCharArray();
    }
}
