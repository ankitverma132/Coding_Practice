package myPack2;

import myPack1.*;


public class Y extends X{
	
	public static void main(String args[]){  
	 	   		  
    	Y obj=new Y();
    	
    	obj.hide();    //using method of another package by inheritance as method is protected
    	
	}
		
	private void hide2()
	{
	   System.out.println("myPack2----Y-----hide()");			
		
	}	

}

//---------------------------------------------------------

    class inher extends Y{
    	
    	public void hide2()
    	{
    		System.out.println("myPack2----Y-----hide2()");
    	}
    	
    }
