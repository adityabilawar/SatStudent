public class SatStudent
{
    
    	//public  String name;
    	//public  int math;
   //	public  int verbal;
   //	public  int writing;
    	
		

    	
   	public SatStudent(String s, int m, int v, int w)
    	{
   			name = s;
   			math = m;;
   			verbal = v;
   			writing = w;
    	}
  
	public String getName()
	{
		 return name; 
	}
	
	public int getMath()
	{
		 return math; 
	}
	public int getVerbal()
	{
		 return verbal; 
	}
	public int getWriting()
	{
		
		
		 return writing; 
	}
	public double getGrade()
	{
		double v = (math + verbal + writing) / 2;
		return v;
		
	}
	
	public int getTotal()
	{
		int b = math + verbal + writing;
		return b;
		
	}
	
		 public String toString(){
			 int a = (math + verbal + writing);
			 return name + " " + a;
			 }
	    }
	
	
	