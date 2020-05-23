package JavaTraining;

public class BMWCarAbstraction extends CarAbstract {

	
	BMWCarAbstraction(){
		super(4);
		System.out.println("in bmw constructor");
	}
	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("Luxury car bmw");
	}
	
	public void model()
	{
		System.out.println("in model bmw");
	}
	
	public void wheels()
	{
		System.out.println("in wheels");
	}

}
