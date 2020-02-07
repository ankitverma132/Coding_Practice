public class EmailAdrs {

	public static void main(String[] args) {

	    String str= "ftphttprururu";
	    String s= "";
	    
	    	int i=0;
	    	int j=0;
	    	
	    	while(i<str.length()) {
	    		
	    		if(str.charAt(i)=='p') {
	    		s = s+ str.substring(j, i+1);
	    		s = s + "://";
	    		i++;
	    		j=i;
	    		break;
	    	    }	
	    		else if(str.charAt(i)!='p') {
	    			i++;
	    		}
	    	}
	    	
             while(i<str.length()) {
	    		
	    		if(str.charAt(i)=='r') {
	    		s = s+ str.substring(j, i);
	    		s = s + ".";
	    		j=i;
	    		break;
	    	    }	
	    		else if(str.charAt(i)!='r') {
	    			i++;
	    		}
	    	}
             
             while(i<str.length()) {
 	    		
 	    		if(str.charAt(i)=='u') {
 	    		s = s+ str.substring(j, i+1);
 	    		s = s + "/";
 	    		i++;
 	    		j=i;
 	    		break;
 	    	    }	
 	    		else if(str.charAt(i)!='u') {
 	    			i++;
 	    		}
 	    	}
             while(i<str.length())
             {
            	 if(i==str.length()-1) {
            	 s = s+ str.substring(j, i+1);
            	 i++; 
            	 }
            	 else {
            		 i++;
            	 }
             }
             
             System.out.println(s);
	}
}