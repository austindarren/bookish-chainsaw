

	class ObjectsCount { 
		  
	    static int noOfObjects = 0; 
	  
	    // non-parameterized constructor. Unlike other non-static 
	    // functions, a constructor can access static members 
	    public  ObjectsCount() 
	    { 
	        noOfObjects += 1; 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	    	ObjectsCount t1 = new ObjectsCount(); 
	    	ObjectsCount t2 = new ObjectsCount(); 
	    	ObjectsCount t3 = new ObjectsCount(); 
	  
	       // We can also write t1.noOfObjects or 
	       // t2.noOfObjects or t3.noOfObjects 
	       System.out.println(ObjectsCount.noOfObjects); 
	    } 
	} 

