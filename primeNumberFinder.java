
public class primeNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime;
		int min =1;
		int max = 10;
		int[] numList = new int[10];

	
	


		//Put all the numbers in a array
		for(int i=0; i<max;i++) {
			numList[i]  = min;
			min++;
			
		}
		for(int i=0; i<numList.length;i++) {
			System.out.println("Num List "+numList[i]);

		}

		//Get Number Amount of Prime Numbers store it in count
		int count=0;
		int temp;
		for(int i =0; i<numList.length;i++) {
		    temp = numList[i];
		    isPrime =isPrime1(temp);
	    	if(isPrime) {
		    	count++;
	    	}   	
		}
		
//		Initialize prime number array and make it length of The prime amount
		int[] primeNumList = new int[count];
		int index = 0;


		for(int i =0; i<numList.length;i++) {
		    temp = numList[i];
		    isPrime =isPrime1(temp);
	    	if(isPrime) {
		    	primeNumList[index] = temp;
		    	index++;
	    	}   	
		}
		
		for(int i=0; i<primeNumList.length;i++) {
		System.out.println("PRIME List "+primeNumList[i]);

	}

		
	}
	
	
	private static boolean isPrime1(int n) {
		boolean isPrime=true;;

		
	       if (n <= 1)
	            return false;
	        if (n <= 3)
	            return true;
	  
	        // This is checked so that we can skip
	        // middle five numbers in below loop
	        if (n % 2 == 0 || n % 3 == 0)
	            return false;
	  
	        for (int i = 5; i * i <= n; i = i + 6)
	            if (n % i == 0 || n % (i + 2) == 0)
	                return false;
	  
        
        return isPrime;
  
	}


}