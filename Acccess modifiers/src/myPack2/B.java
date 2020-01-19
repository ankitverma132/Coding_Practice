package myPack2;
import myPack1.*;

public class B {
	

	public void hide()
	{
	   
		System.out.println("myPack2----B-----hide ()");			
		
	}
	
	
	public static void main(String[] args) {
		
	 C obj=new C();
	//C.show();       //error: as show() method is default cant accessed outside package.
	 	 
	}
	
	
	
}
