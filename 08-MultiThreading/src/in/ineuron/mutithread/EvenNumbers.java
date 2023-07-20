package in.ineuron.mutithread;

public class EvenNumbers implements Runnable{
      public void run() {
    	  for(int i=2;i<=10;i+=2) {
    		  System.out.print(i);
    		  
    	  }
    	  
      }
}
