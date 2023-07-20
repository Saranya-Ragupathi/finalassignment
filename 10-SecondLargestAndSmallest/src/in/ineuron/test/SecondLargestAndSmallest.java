package in.ineuron.test;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SecondLargestAndSmallest {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     List <Integer> list=new ArrayList<>();
     
     System.out.println("Enter the number of elements : ");
     int count=sc.nextInt();
     
     System.out.println("Enter the elements ::");
     for(int i=0;i<count;i++) {
    	 int number=sc.nextInt();
    	 list.add(number);
     }
     if(count>=2) {
    	 Collections.sort(list);
    	 
    	 int secondSmallest=list.get(1);
    	 int secondLargest=list.get(count-2);
    	 
    	 System.out.println("Second Smallest::"+secondSmallest);
    	 System.out.println("Second Largest::"+secondLargest);
     }else {
    	 System.out.println("At Least Two Elements Are Required...");
     }
     
	}

}
