package TW;

public class TestB {

	public static void main(String[] args) {
	
		
		int x,y,z;
		
		TestA b = new TestA();
		
		x=b.sum(100,200);
		y=b.sub(100,50);
		z=b.mul(x,y);
		System.out.println("The vlaue of equation is" +z);
	}
	
	
}
