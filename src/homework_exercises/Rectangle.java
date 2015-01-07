package homework_exercises;

public class Rectangle extends Shape {
	private float width;
	private float height;
	
	public Rectangle(float width, float height)
	{super("Rectangle");
	this.width = width;
	this.height = height;}
	
	public float calculateArea()
	{return this.width * this.height;}
}
