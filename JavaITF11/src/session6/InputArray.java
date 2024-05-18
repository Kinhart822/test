/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session6;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// Cho phép người dùng nhập vào kích thước array
		Scanner input = new Scanner(System.in);

		int size;
		do {
		System.out.print("Nhap vao kich thuoc array:  ");
		size = input.nextInt();
		} while (size <= 0);
		
		// Tạo array
		float[] javaFinalMark = new float[size];
		
		// Lần lượt nhập các giá trị vào cho array
		for (int i = 0; i < size; i++) {
			System.out.printf("Nhap vao gia tri thu %d:  ", i);
			javaFinalMark[i] = input.nextFloat();
		}
		
		// In ra array mà người dùng vừa nhập vào
		System.out.print("Array vua nhap vao la:  ");
		for (float value: javaFinalMark) {
			System.out.print(value + " , ");
		}
		
		// Thao tác duyệt array:
		// Tính tổng các giá trị trong array
		float sum = 0;
		for (int i =0;i < size; i++ ) {
			sum += javaFinalMark[i];
		}
		
		// Tính giá trị trung bình
		float average = sum/size;
		System.out.println("Gia tri trung binh la:  " + average);
		
		// Tìm giá trị lớn nhất trong một mảng
        int[] array = {1, 2, 3, 4, 5};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        
        // Sắp xếp array từ bé đến lớn
        float temp;
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                if(javaFinalMark[i] > javaFinalMark[j]){
                    temp = javaFinalMark[i];
                    javaFinalMark[i] = javaFinalMark[j];
                    javaFinalMark[j] = temp;        
                }
            }
        }

//      System.out.print("Array sau khi sắp xếp lại: ");
//		for (float value : javaFinalMark) {
//			System.out.print(value + ", ");
//		}
//		System.out.println();       
        
        for(int i = 0; i < size; i++){
            System.out.printf("%.2f ", javaFinalMark[i]);
        }
	}

}
