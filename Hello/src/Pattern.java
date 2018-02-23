class Pattern
{
    public static void main(String[] args)
    {
    	    int i,j,n,count=1,k;
    	    n=6;
    	    for(i=1;i<=n;i++)
    	    {
    	        if(i%2!=0)
    	        {
    	            for(j=1;j<=i;j++)
    	            {
    	                System.out.print(count++ + "\t");
    	            }
    	            System.out.println();
    	        }
    	        else
    	        {
    	            k=count;
    	            k=k+i-1;
    	            for(j=1;j<=i;j++)
    	            {
    	                System.out.print(k-- + "\t");
    	                count++;
    	            }
    	            System.out.println();
    	        }
    	    }
    }
}