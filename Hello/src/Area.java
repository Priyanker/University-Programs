/*
 Implement a Class called Circle with two instance variable radius of type integer , area of type 
 of double  and three instance methods namely setRadius(), getRadius(), caluculateArea().

SetRadius() method will set the value for the variable radius  , getRadius() method will return the 
value of the radius, caluculateArea() calculates the area of the circle and prints the area.

 Create a Test class to create object for Circle class and call the method calculateArea() method 
 to print the area

Note: the radius of the circle should be a positive integer. if any other radius is provided 
print -1.
input =
2
output=
12.56
*/
import java.util.*;
class Circle
{
    int radius;
    double area;
    public void setRadius()
    {
        Scanner scan= new Scanner(System.in);
        radius= scan.nextInt();
        scan.close();
    }
    public int getRadius()
    {
        if(radius<0)
        {
            return -1;
        }
        return radius;
    }
    public void calculateArea(int r)
    {
        if(r==-1)
        {
            System.out.println(-1);
        }
        else
        {
            area=r*r*3.14;
            System.out.println(area);
        }
    }
    
}
class Area
{
    public static void main(String[] args)
    {
        Circle x=new Circle();
        x.setRadius();
        int r1=x.getRadius();
        x.calculateArea(r1);
        
    }
}
