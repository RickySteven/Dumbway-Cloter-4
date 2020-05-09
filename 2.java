package JavaLearning;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {

		
		 
			int counter, i=0, j=0, temp;
			int number[] = new int[100];
			Scanner scanner = new Scanner(System.in);
			System.out.print("Masukan jumlah element: ");
			counter = scanner.nextInt();

			for(i=0; i<counter; i++)
			{
			    System.out.print("Masukan angka pertama"+(i+1)+": ");
			    number[i] = scanner.nextInt();
			}
			System.out.print("Array Awal : ");
			for(i=0; i<counter; i++)
			{
				  System.out.print(number[i]+ "  ");
		
			}
			System.out.println;
			j = i - 1;     
			i = 0;         
			scanner.close();
			while(i<j)
			{
		  	   temp = number[i];
			   number[i] = number[j];
			   number[j] = temp;
			   i++;
			   j--;
			}

			System.out.print("Reversed array: ");
			for(i=0; i<counter; i++)
			{
			   System.out.print(number[i]+ "  ");
			}       
		   }
		

	

}
