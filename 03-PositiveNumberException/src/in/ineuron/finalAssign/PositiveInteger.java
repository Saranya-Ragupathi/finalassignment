package in.ineuron.finalAssign;
import java.util.Scanner;

public class PositiveInteger {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          try {
        	  System.out.print("Enter The Positive Number ::");
        	  Integer number=scanner.nextInt();
        	  if(number<0) {
        		  throw new Exception ("Input Must be a Positive Number");
        	  }
        	  System.out.println("Input Is Valid");
        	  
          }catch(Exception e) {
        	  System.out.println("ERROR ::"+e.getMessage());
          }
	}

}
