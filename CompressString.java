public class CompressString {
	public static void main(String[] args) {

		String s="aaabbdsaa";
		System.out.print(CompressString(s));
	}
//=======================================================
	private static String CompressString(String s) {
		String str="";
		
        for(int i=1; i<s.length(); i++){
        	
        	int count=1;
        	while(i<s.length() && s.charAt(i)==s.charAt(i-1) ) {
        		 count++;
        		 i++;
        	}
        	if(count>1) {
        		str = str + s.charAt(i-1);
        		str = str + count;
        	}
        	else if(count==1) {
        		str = str + s.charAt(i-1);
        	}
        	
        }
    
       if(s.charAt(s.length()-1)!=s.charAt(s.length()-2)) {
    		str = str + s.charAt(s.length()-1);    		
    	}
        
        return str;
	}
}
