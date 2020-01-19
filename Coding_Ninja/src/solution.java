import java.util.*;
import java.util.ArrayList;
public class solution {
	
	public static void main(String[] args)
	{
		FindSplNumbers(21);		
	}
	
	public static void FindSplNumbers(long n){
		ArrayList<Long> A=new ArrayList<>();
		long m=(long)n;
        
        for(Long i=m-1;i>0;i--)
        {
            long S=0;
            long k=i;
            while(k>0)
              {
               long b=k%10;
               S=S+b;
               k=k/10;
               }
            S=S+i;
            if(S==m)
            {
                A.add(i);
            }             
        }
        
        Collections.sort(A, Collections.reverseOrder());
        for(int i=0;i<A.size();i++)
        {
            System.out.println(A.get(i));
        }
	}
}
