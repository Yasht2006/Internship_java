import java.util.Scanner;
public class Pr15
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		float radius;
		
		System.out.print("Enter the radius: ");
		radius = inp.nextFloat();
		
		Circle c = new Circle(radius);
		
		c.setter(radius);
		
		float area = c.calculateArea();
        float perMtr = c.calculatePerimeter();
        
        System.out.println("Radius is: "+c.getter());
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perMtr);
	}
}

class Circle
{
	private float radius;
	
	public Circle(float radius)
	{
		this.radius = radius;
	}
	public float getter()
	{
		return radius;
	}
	
	public void setter(float radius)
	{
		this.radius = radius;
	}
	
	public float calculateArea()
	{
		 float area = 3.14f * radius * radius;
		 return area;
	}
	
	public float calculatePerimeter()
	{
		float perMtr = 2 * 3.14f * radius;
		return perMtr;
	}

}