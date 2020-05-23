package JavaTraining;

public abstract class CarAbstract {

	int i=10;
	
	public abstract void type();
	
	CarAbstract()
	{
		System.out.println("in carabstract constructor");
	}
	CarAbstract(int i)
	{
		this.i = i;
		System.out.println("Value of i "+i);
		System.out.println("in carabstract constructor");
	}
	
	public void model()
	{
		System.out.println("in model");
	}
	public void color()
	{
		System.out.println("in color");
	}
}
