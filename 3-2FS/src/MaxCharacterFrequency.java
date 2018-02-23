import java.util.*;
public class MaxCharacterFrequency {
	static int setFreq(char x, char[] y)
	{
		int freq1=0;
		for(int i=0;i<y.length;i++)
		{
			if(x==y[i])
			{
				freq1++;
			}
		}
		return freq1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;
		int i,count=0;
		int freq;
		char temp='z';
		String temp1 = "";
		int max=0;
		char store='x';
		Scanner scan = new Scanner(System.in);
		x = scan.nextLine();
		char[] arr = x.toCharArray();
		Arrays.sort(arr);
		x=Arrays.toString(arr);
		//System.out.println(String.valueOf(arr));
		for(i=0;i<arr.length;i++)
		{
			freq=setFreq(arr[i], arr);
			//System.out.println(freq);
			if(max<freq && store!=arr[i])
			{
				max=freq;
				temp=arr[i];
				temp1=""+temp;
				//temp1+=temp;
				count=0;
			}
			else if(max==freq && store!=arr[i])
			{
				//max=freq;
				temp1+=arr[i];
				count=1;
			}
			store=arr[i];
		}
		if(count==0)
		{
			System.out.println(temp);
		}
		else
		{
			for(i=0;i<temp1.length();i++)
			{
				System.out.println(temp1.charAt(i));
			}
		}
		scan.close();
	}

}