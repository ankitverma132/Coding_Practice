package myPack1;


public class C {
		
	 void show()            //Default by default
	{
	   System.out.println("myPack1----C-----Show()");			
		
	}	
	 
}

//------------------------------------------------------

class S { 
	
    public static void main(String args[]){  
 	   
    C obj=new C();    
    	       
    obj.show();   // show() method is default so can be accessed outside class within package
    
    
   }
    
}