/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package tutorial_3;

public class Counter {

//	private int value;
	protected int value;

    // EFFECTS: Makes this contain 0.
	public Counter(){
//		this.value = 0;
		this.value = 1;
	}

	// EFFECTS: Returns the value of this.
	public int get() {
		return this.value;
	}

    // MODIFIES: this
    // EFFECTS: Increments the value of this.
	public void incr() {
		this.value++;
	}

}
