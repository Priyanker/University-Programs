
import java.util.*;
public class Anagram
{
    public static void main(String[] args)
    {
        String x,y;
        char temp[] = new char[100];
        int i,j;
        Scanner scan = new Scanner(System.in);
        x = scan.next();
        y = scan.next();
        x.replaceAll("//s","");
        y=y.replaceAll("//s","");
        
        x=x.toLowerCase();
        for(i=0;i<x.length();i++)
        {
            temp[i] = x.charAt(i);
        }
        if(x.length()!=y.length())
        {
            System.out.print("-1");
        }
        else
        {
            for(i=0;i<y.length();i++)
            {
                for(j=0;j<x.length();j++)
                {
                    if(y.toLowerCase().charAt(i)==temp[j])
                    {
                        temp[j]='\0';
                        break;
                    }
                }
            }
            for(i=0;i<x.length();i++)
            {
                if(temp[i]!='\0')
                {
                    System.out.print("-1");
                    break;
                }
            }
            if(i==x.length())
            {
                System.out.print("1");
            }
        }
    }
}