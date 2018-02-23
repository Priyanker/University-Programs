import java.util.*;
class Max{
	static int max(int... vargs)
	{
		int m=0;
		for(int i:vargs)
		{
			if(i>m)
			{
				m=i;
			}
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max x= new Max();
		System.out.println(x.max(10,41,21,11,1,7));
	}

}
