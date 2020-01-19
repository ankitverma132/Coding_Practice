public class LCM {	
	
	public static void main(String[] args)
	{
		func(15);		
	}

	public static void func(long n)
	{
		int m=(int)n;
        int Sum=0;
        for(int i=1;i<=m;i++)
        {
           Sum=Sum + LCM(i,m);
        }
        System.out.println(Sum);	
	}
    
    public static int LCM(int a, int b)
    {
        int l,s;
        if(a>b){l=a;s=b;}      
        else {l=b;s=a;}
        
        for(int i=l; ; i+=l)
        {
          if(i%s==0) 
          {
              return i;
          }
            
        } 
    }		
}