/*
Create  a  class called Employee  with  instance variables namely eno, ename,  basicsal ,da, hra 
and create one method namely calculateTotalSal().

Eno is of type of int, ename is of type String , basicsal, da,hra as of type double.

 calculateTotalSal() should calculate the total salary of the employee based on basicsal & 
 print the total salary in double.

Create an executable class  called Test in which create an instance of Employee class  , 
initialize the members of Employee class with the help of Constructors & 
invoke the  calculateTotalSal().

Note: da is 10% of basicsal & hra is 15% of basicsal

Use casting if necessary.

Read the input in the following manner :- First Eno, followed by Ename followed by basicsal

Sample test case 1

Input
101
Ramu
10000
Output
12500
*/
import java.util.*;
class Employee
{
    int eno;
    String ename;
    double basicSal;
    public void calculateTotalSal(double basicSal)
    {
        double tSal;
        tSal=basicSal+(basicSal*10)/100+(basicSal*15)/100;
        System.out.println(tSal);
    }
}
class HelloWorld
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        Scanner scan= new Scanner(System.in);
        //int eno=scan.nextInt();
        //String ename=scan.next();
        double basicSal=scan.nextDouble();
        e1.calculateTotalSal(basicSal);
        scan.close();
    }
}