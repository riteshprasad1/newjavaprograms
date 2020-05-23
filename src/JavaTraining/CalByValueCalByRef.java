package JavaTraining;

public class CalByValueCalByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalByValueCalByRef cv = new CalByValueCalByRef();
		cv.p=21;
		cv.q=22;
		 int d =cv.sum(100, 200);
		 System.out.println(d);
		 cv.swap(cv);
		 System.out.println(cv.p);
		 System.out.println(cv.q);
	}

	public int sum(int a,int b) { //cal by value
		//a=20;
		//b=30;
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	//cal by reference
	public void swap(CalByValueCalByRef t)
	{
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q=temp;
			
	}
	
}
