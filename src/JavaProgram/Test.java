package JavaProgram;

public class Test {
	
	void show (int a) {
		System.out.println("test");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
	    t.show(10);
	    Xyz X=new Xyz();
	    X.show(11);
	

	}
		
	}
	
class Xyz extends Test{
	
    void show (int a )
	{
		System.out.println("xyz");
	}}
	