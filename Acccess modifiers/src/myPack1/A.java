package myPack1;

public class A {
		
	private int data=40;
		
//	private A() {     //if we make a constructor private we can not create object of that class
//		super();
//	}

	private void msg(){
		System.out.println("Hello java");
		}  
	
    public void show()
	{
	   System.out.println("myPack1----A-----Show()");	
				
	}

}
//-------------------------------------------------------------
      class Simple{       
	       public static void main(String args[]){  
	    	   
	       A obj=new A();    //It would give an error we constructor of A was private
	       
	      // obj.data;//Compile Time Error  
	      // obj.msg();//Compile Time Error
	       
	       obj.show();	       

	       C obj1=new C();
	       obj1.show();      // as show is default so accessible inside package
	       
	   }  
}