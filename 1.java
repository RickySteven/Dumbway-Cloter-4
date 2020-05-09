package JavaLearning;
import java.util.Scanner;
public class MenghitungKata {
	public static void getOrgString(String s) { 
		  int i = 0, count = 0; 
		  if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
          {	
              count++;
               }
		  
	        while (i < s.length())  
	        {  
	        	
	           if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	            {	
	                count++;
	           
	            }
	            
	            i++;  
	        } 	
	        System.out.print(count + " terdiri dari -> (" );
	
	        // Traverse the rest of the  
	        // character one by one 
	        System.out.print(Character.toLowerCase(s.charAt(0)));
	       i = 1;  
	        while (i < s.length())  
	        {  
	        	
	            // If current character is uppercase  
	            // print space followed by the  
	            // current character in lowercase  
	            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	            {
	                System.out.print(" "+ Character.toLowerCase(s.charAt(i)));  
	            // Else print the current character  
	            }
	            else
	            {
	                System.out.print(s.charAt(i));  
	            }     
	            i++;  
	        } 
	        System.out.print(")");
	        
	}
	    public static void main(String args[]) 
	    { 

	    	System.out.print("Masukan Camel Text: ");
	    	  Scanner scanner = new Scanner(System. in);
	          String s = scanner. nextLine();
	          System.out.print("Output : ");
	          getOrgString(s);
	        
	    } 
	}
	


