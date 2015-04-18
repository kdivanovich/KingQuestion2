import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
	  
	  /*  I am aware this won't be considered, but I hate leaving 
	   * problems unfinished or looking messy. 
	   * Plus code reuse is always a good idea.
	   * And it took me only 10 extra minutes.
	   */
 
	  String s = "10,5,2,3,4,91,1,11,6;15";
	  
	  
	  // get only the summables
	  int separ = s.indexOf(";");
	  String sumStr =  s.substring(separ + 1, s.length() );
	  
	  // what the sums should get compared to
	  int sum = Integer.parseInt(sumStr);	
	  
	  if (separ != -1)
	  {
	      s = s.substring(0, separ);	
	  }
	  
	  // Now the string S is "10 5 2 3 4 91 1 11 6 " .
	 
	 
	  // Remove the commas and cast the numbers to integers.
	  String[] numberStrs = s.split(",");
	  int[] numbers = new int[numberStrs.length];
	  
	  for(int i = 0;i < numberStrs.length;i++)
	  {		  
	     numbers[i] = Integer.parseInt(numberStrs[i]);
	     
	     // To test the string uncomment: 
	     
	     //System.out.print(numbers[i] + " ");
	  }
	  
	  
	  //Print the answer pairs:
	  //System.out.println("\nAnswer: ");
	  
 	  for (int i = 0; i < numbers.length; i++) {
 		  for (int j = i+1; j < numbers.length; j++ ) {
 			  
 			 if (numbers[i] +  numbers[j] == (sum)) {
	 			  System.out.print(numbers[i] + "," + numbers[j] + ";");
	 		  }
 			 
 		  }	 
 	  }
 	  
 	 System.out.println();
 
  }
}