package homework_exercises;

public class Square extends Shape {
	private float side;
	
	public Square(float side)
	{super("Square");
	this.side = side;}
	
	public float calculateArea()
	{return this.side * this.side;}
	
	
}
