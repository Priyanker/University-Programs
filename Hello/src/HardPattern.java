/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int i, j,k;
	    int n = scan.nextInt();
	    for( i=1;i<=n;i++)
	    {
	        for( j=1;j<i;j++)
	        {
	            System.out.print(" ");
	        }
	        if(n-i+1!=1)
    	        System.out.print(n-i+1);
	        for( k = j; k<=2*(n-1)-i;k++)
	        {
	            System.out.print(" ");
	        }
	        System.out.print(n-i+1);
	        System.out.println();
	    }
	    for(i=1;i<n;i++)
	    {
	        for(j=1;j<=n-i-1;j++)
	        {
	            System.out.print(" ");
	        }
	        System.out.print(i+1);
	        for(k=1;k<=2*(i)-1;k++)
	        {
	            System.out.print(" ");
	        }
	        System.out.print(i+1);
	        System.out.println();

	    }
	}
}
