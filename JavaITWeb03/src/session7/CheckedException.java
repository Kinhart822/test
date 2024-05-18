/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String filename = "text.txt";
		
		try {
			FileInputStream fileInputStream = new FileInputStream(filename);
			int c = -1;
			while( (c = fileInputStream.read())!= -1){
				System.out.println((char) c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
