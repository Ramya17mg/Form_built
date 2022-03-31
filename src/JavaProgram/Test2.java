package JavaProgram;

public class Test2 {
	void show (int a) {
		System.out.println("test");
	}
	
	class Xyz extends Test{
	
    void show (int a )
	{
		System.out.println("xyz");
	}
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
	    t.show(10);
	

	}

}}


