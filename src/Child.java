
  public class Child 
	{
	   int a1;
	   String s;
	   static int sta=10;
	   final int b=6;
	   
	   
	   Child(int a,String b)
	   {
		  a1=a; 
		  s=b;
	   }
		
	   public void valueChange()
	   {
		   sta=sta+10;
	   }
	   
	 
	  public static void main(String[] args) {
			Child c= new Child(10,"fgfg");
			Child c1= new Child(20,"hgfhgf");
			System.out.println(c.a1);
			System.out.println(c.s);
			c1.valueChange();
			System.out.println(c1.sta);
			System.out.println(c.sta);
			
			
	
				
	}
	}
  
  
  
  
  
 
  


