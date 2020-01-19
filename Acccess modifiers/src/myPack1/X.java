package myPack1;


public class X {	
	
    protected void hide()      //can be accessed outside package but only thorough inheritance
	{
    	
	   System.out.println("myPack1----X-----hide()");			
		
	}

}

//--------------------------------------------------

class Simple2{      
	
    public static void main(String args[]){  
    	
    	X obj=new X();
    	
    	obj.hide();
 	   
   
    	
    	
    }
    
} 