package homework_exercises;

public abstract class Shape {

	protected String name;
	
	public Shape(String name)
	{this.name = name;}
	
//	public void setName(String name)
//	{this.name = name;}
	
	public abstract float calculateArea();
	
	public String getName()
	{return name;}
	
}
