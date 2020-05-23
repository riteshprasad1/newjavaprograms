package JavaTraining;

public class TestCarAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	BMWCarAbstraction bm = new BMWCarAbstraction();
		//bm.type();
	//	bm.model();
//		bm.wheels();
		
		CarAbstract car = new CarAbstract() //annoymous class
				{
					public void type()
					{
					System.out.println(" in type");	
					}
				};
				car.type();
	}

}
