package JavaLearning;
import java.util.Scanner;

public class FunctionCetak {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukan ukuran bintang yang harus dicetak: ");
		int a = scanner.nextInt();
		 if ( a % 2 == 0 )
		 {
		        System.out.println("Angkanya harus ganjil, masukan lagi");
		     //   System.out.flush(); 
		        
		 }
		     else
		     {
		    	 myMethod(a);

		     }
		

	}
	public static void myMethod(int a){
		int i = 0 , j = 0 , k = 0;
		for(i=a-1; i>=0; i--)
		{
			for(k=i; k>0; k--)
			{
			   System.out.print(" ");
			}

			for(j=0; j<a; j++)
		{
		   System.out.print("*");
		   
		}
			System.out.println();
		}  
	}
}
