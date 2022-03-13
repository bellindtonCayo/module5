

	public class Iterative extends Thread implements Runnable {

		private String name;
		private Integer numb1;
		
		public Iterative(String name, Integer n) {
			super();
			setName1(name);
			setNumb1(n);
		}




		public String getName1() {
			return name;
		}


		public void setName1(String name) {
			this.name = name;
		}


		public Integer getNumb1() {
			return numb1;
		}

		public void setNumb1(Integer numb1) {
			this.numb1 = numb1;
		}



		@Override
		public void run() {
	//Start timer for Iterative Fibonacci------------------
			long time1 = System.nanoTime();
			long time2, time3;
			
	//Iterative Fibonacci process------------------------------------		
			Integer n1=0,n2=1,n3=0; 
			try {
				
				System.out.print("Iterative runtime efficiency: ");   
			    
				 for(int i=2; i<=numb1;++i)  
				 {    
				  n3=n1+n2;    
				   
				  n1=n2;    
				  n2=n3;    
				 }    
				}catch(Exception e)
			{
					e.printStackTrace();
			}
	// Capture the total time of Iterative fibonacci Sequence
			time2 = System.nanoTime(); 
			time3 = time2 - time1;
			System.out.println(n3 + " in "+ time3 + " ns");
			
		}
		
		

}
