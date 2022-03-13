	/* Author: Bellindton Cayo
	03/14/2022
	CRN: 26773
	Dr. Macon
	*/

public class DocAssignment {


		

		public static void main(String[] args) {
	// Instantiate 2 threads and two fibonacci type		
			Thread Thread1 = new Thread( new Iterative("Iterative",8));
			Thread Thread2 = new Thread( new Recursive("Recursive",8));
			
	//start thread1 search		    
			Thread1.start();
			
			
//		Put thread 2 to sleep for better synchronization of threads  
			try {
				Thread2.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	// start Thread 2 search
			Thread2.start();

	}
	

}
