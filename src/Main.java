import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
	  
	  
	  // That was scribbled in ~ 25 minutes + 10 minutes I worked on the website = ~ 35 mins in total
	  // I don't remember what all the test cases were so this is a solution for the first one.
 
	  String s = "1,2,3,4,6;5";
	  
	  
	  // get only the summables
	  int separ = s.indexOf(";");
	  String sumStr =  s.substring(separ+1, s.length() );
	  int sum = Integer.parseInt(sumStr);
	  
	  if (separ != -1)
	  {
	      s = s.substring(0, separ);	
	  }
	  
	  // s = "1,2,3,4,6";
	 
	  
	 	  String[] array = s.split(",");
	 	  int[] ints = new int[array.length];
	 	  for(int i=0; i<array.length; i++)
	 	  {
	 	      try{
	 	          ints[i] = Integer.parseInt(array[i]);
	 	      }
	 	      catch(NumberFormatException nfe){
	 	          //Not an integer, do some
	 	      }
	 	  }
	 	  
	 	  String arr = "";
	 	 for(int i=0; i<array.length; i++){
	 		 arr += array[i];
	 	 }
	 	  
	 
	  
	 	System.out.println("HERE: ");
	 	  for (int i = 0; i < arr.length()-1; i++) {
	 		  for (int j = i+1; j < arr.length() - 1; j++ ) {
	 			  
	 			 if ( Integer.parseInt((arr.substring(i, i+1))) +  Integer.parseInt((arr.substring(j, j+1))) == (sum)) {
		 			  System.out.print(arr.substring(i, i+1) + "," + arr.substring(j, j+1) + ";");
		 		  }
	 		  }	 		  
	 		  
	 	  }
	 	 System.out.println("\nEND ");
	 
	 	  
	 	  
	 	  
	  
	  // Tests:
	  //String[] arr = s.split(";", -1);
	  
	  for (int i=0; i<array.length; i++) {	  
		  //System.out.print(array[i]);
	  }
	  
	  //System.out.println("\nSum:" + s.substring(0,1) + "\nInt:" + array[4] + "\nArr:" + arr);
	 
  }
}
