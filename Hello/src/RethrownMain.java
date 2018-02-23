class Rethrownex
{
public static void Exceptiongen()
{
int[] num={2,4,6,8,10,12};
int[] den= {4,0,2,0,5};
for (int x=0;x<num.length;x++)
{
try
{
System.out.println("Division of numerator and denominator is "+ num[x]/den[x]);
}
catch(ArithmeticException ae)
{
System.out.println(" exception of divide by zero ");
}
catch(ArrayIndexOutOfBoundsException ai)
{
System.out.println(" match not found");
throw ai;
}
}
}
}
class RethrownMain
{
public static void main(String[] args)
{
try
{
Rethrownex.Exceptiongen();
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("fatal error");
}
}
}