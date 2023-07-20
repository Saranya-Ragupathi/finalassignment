package in.ineuron.mutithread;

public class ThreadTest {

	public static void main(String[] args) {

		Thread evenThread=new Thread (new EvenNumbers());
		Thread oddThread=new Thread(new OddNumbers());
		
		evenThread.start();
		oddThread.start();
		
	
	}

}
