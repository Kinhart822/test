/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BinaryStreamDemo {

	public static void main(String[] args) {
		
		String str = "VietNam";
		byte[] byteStr = str.getBytes();

		try(OutputStream out = new FileOutputStream("binary.io")){
			out.write(byteStr);
		} catch (Exception e)	{
		    e.printStackTrace();
		}
		System.out.println("Done!");
	}
	
	public static void readFile(String fileName) {
		try(InputStream inputStream = new FileInputStream(fileName)){
			int term;
			byte[] buffer = new byte[8*1024];   // 8Kb
			while((term = inputStream.read()) != -1) {
//				char c = (char) term;
//				System.out.println(c);
				for (byte b : buffer) {
					char c = (char) b;
					if (c != '\u0000') {
						System.out.println(c);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
