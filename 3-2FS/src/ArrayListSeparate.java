import java.util.*; 
import java.io.*;

class ArrayListSeparate {  
  public static void LongestWord(String sen) { 
  String[] res;
  //String temp=" ";
  int max=0,currLen=0, prev=0;
  int temp=0;
  ArrayList<Character> ar = new ArrayList<Character>();
  //char[][] arr = new char[10][];
  int arr[] = new int[2];
  Character[] arr11 = null;
  int index=0;
  //ArrayList<String> ar = new ArrayList<String>();
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
  /*
   * 
   * METHOD 1
  	res=sen.split("&|!|\\s");
       for(int i=0;i<res.length;i++)
       {
           if(max<res[i].length())
           {
               max=res[i].length();
               temp = res[i];
           }
       }
       System.out.println(temp);
       
       */
  
  
       for(int i=0;i<sen.length();i++)
       {
       //if((sen.charAt(i)>='a' & sen.charAt(i)<='z') || sen.charAt(i)==' ' || (sen.charAt(i)>='A' & sen.charAt(i)<='Z'))
    	if(Character.isLetter(sen.charAt(i))|| sen.charAt(i)==' ')
       {
           ar.add(sen.charAt(i));
       }
       }
       
       
       
        //PRINTS THE ARRAYLIST WITHOUT SPECIAL CHARACTERS
        for(int i=0;i<ar.size();i++)
       {
           System.out.print(ar.get(i)); 
       }
        System.out.println();
       System.out.println(ar);
      
       
       
       /*
        // METHOD 2
        temp=0;
        prev=0;
       for(int i=0;i<ar.size();i++)
       {
           int j=i;
           temp=0;
           while(ar.get(j)!=Character.valueOf(' '))
           {
               temp++;
               j++;
           }
           if(temp>prev)
           {
               prev=temp;
               arr[0]=i;
               arr[1]=j;
           }
           i=j;
       }
       for(int i=arr[0];i<arr[1];i++)
       {
            System.out.print(ar.get(i)); 
       }
       */
       
       /*
       //METHOD 3
       
       max=0;
       for(int i=0;i<ar.size();)
       {
    	   int j=i;
    	   currLen=0;
    	   while(!(ar.get(j)==(Character.valueOf(' '))))
    	   {
    		   currLen++;
    		   j++;
    	   }
    	   if(currLen>max)
    	   {
    		   temp=i;
    	   }
    	   i=j;
    	   
       }
       for(int i=temp;!(ar.get(i).equals(Character.valueOf(' ')));i++)
       {
    	   System.out.print(ar.get(i));
       }
       
       */
       
       /*
       //METHOD 4
       for(int i=0;i<ar.size();i++)
       {
    	   if(ar.get(i).equals(Character.valueOf(' ')))
    	   {
    		   currLen = 0;
    		   temp=i;
    	   }
    	   else
    	   {
    		   currLen++;
    		   if(currLen>max)
    		   {
    			   index=temp;
    			   max=currLen;
    		   }
    	   }
       }
       for(int i=index;ar.get(i)!=Character.valueOf(' ');i++)
       {
    	   System.out.print(ar.get(i));
       }
       
       */
       
       /*
       //METHOD 5
       int j=0;
       char[][] arr12 = new char[10][];
       for(int i=0,k=0; i<ar.size();i++)
       {
    	   if(ar.get(i)==(Character.valueOf(' ')))
    	   {
    		   arr12[j]=new char[k];
    		   j++;
    		   k=0;
    	   }
    	   else
    	   {
    		   k++;
    	   }
       }
       int total = j;
       j=0;
       for(int i=0,k=0; i<ar.size();i++)
       {
    	   if(ar.get(i)==(Character.valueOf(' ')))
    	   {
    		   j++;
    		   k=0;
    	   }
    	   else
    	   {
    		   arr12[j][k++]=ar.get(i);
    	   }
       }
       for(int i=0;i<total;i++)
       {
    	   for(j=0;j<arr12[i].length;j++)
    	   {
    		   System.out.print(arr12[i][j]);
    	   }
    	   System.out.println();
       }
       int maxLen=0;
       for(int i=0;i<arr12.length;i++)
       {
    	   if(arr12[i].length>maxLen)
    	   {
    		   maxLen=arr12[i].length;
    		   index=i;
    	   }
       }
       System.out.println(arr12[index]);
       
       */
       
       //METHOD 6
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<ar.size();i++)
       {
    	   sb.append(ar.get(i));
       }
       System.out.println(sb);
       String x = new String(sb);
       String[] arr12 = x.split(" ");
       int maxLen=0;
       String result="";
       for(int i=0;i<arr12.length;i++)
       {
    	   if(arr12[i].length()>max)
    	   {
    		   max=arr12[i].length();
    		   result=arr12[i];
    	   }
       }
       System.out.println(result);
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    LongestWord(s.nextLine());
    s.close();
  }   
  
}