/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package tutorial_3;

public class Counter2 extends Counter {
	@Override
	public void incr() {
		this.value *= 2;
		super.incr();
	}
}
