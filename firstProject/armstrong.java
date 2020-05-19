package demo;

public class armstrong {
	
	
		public static void main(String[] args) {
			 int num = 1635, rem, digit = 0, sum = 0; 
	          
	        //Copy the value for num in num  
	        int i=num;
	          
	        // Find total digits in num  
	        digit = (int) Math.log10(num) + 1; 
	          
	        // Calculate sum of power of digits  
	        while(num > 0) 
	        {  
	            rem = num % 10; 
	            sum = sum + (int)Math.pow(rem, digit); 
	            num = num / 10; 
	        } 
	          
	        // Check for Armstrong number  
	        if(i == sum) 
	            System.out.println(i+" is an Armstrong number");
	        else
	            System.out.println(i+" is not an Armstrong number");
		}
	
	

}
