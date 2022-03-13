	public class Recursive extends Thread implements Runnable {

		private String name;
		private Integer numb;
		
		public Recursive(String name, Integer n) {
			super();
			setNamex(name);
			setNumb(n);
		}


		public String getNamex() {
			return name;
		}


		public void setNamex(String name) {
			this.name = name;
		}


		public Integer getNumb() {
			return numb;
		}

		public void setNumb(Integer numb) {
			this.numb = numb;
		}

	//Recursion Fibonacci process------------------------------------	
		public  Integer Recursion(int numb){
			if(numb == 0){
				return 0;
			}
			if(numb == 1 || numb == 2){
					return 1;
				}
			 return Recursion(numb-2) + Recursion(numb-1);
		}

		@Override
		public void run() {
	//Start timer for recursive Fibonacci sequence------------------		
			long time1 = System.nanoTime();
			long time2, time3;
			Integer result = null; 
			try {
				
				System.out.print("Recursive runtime efficiency: ");
	// Call to Fibonacci process			
				result = Recursion(numb);
				
					
				}catch(Exception e)
			{
				e.printStackTrace();
			}
	// Capture the total time of recursion fibonacci sequence		
			time2 = System.nanoTime(); 
			time3 = time2 - time1;	
			System.out.print( result + " in " + time3 + " ns");
		}
	}


