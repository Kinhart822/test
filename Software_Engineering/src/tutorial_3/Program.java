/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package tutorial_3;

public class Program {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		Counter2 counter2 = new Counter2();
		Counter3 counter3 = new Counter3(10);

		
//		while (true) {
//			counter.incr();
//			System.out.print(counter.get());
//			
//			Thread.sleep(1000);
//		}
		
		while (true) {
			counter3.incr();
			System.out.print(counter3.get());
	
			Thread.sleep(1000);
	}
		
		
	}

}
