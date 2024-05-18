/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session08;

import java.util.Scanner;

public class DemoArrayProduct {

	public static void main(String[] args) {
		// Nhập danh sách product
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao so luong san pham: ");
		int size  = input.nextInt();
		input.nextLine();
		// Tạo ra array của các product 
		Product[] array = new Product[size];
		
		// Lần lượt nhập vào thông tin
		for(int i = 0; i < size; i++) {
			// Tạo mới 1 sản phẩm
			array[i] = new Product();
			// Lần lượt nhập giá trị cho sản phẩm 
			System.out.print("Nhap ten san pham: ");
			array[i].name = input.nextLine();
			System.out.print("Nhap gia san pham: ");
			array[i].price = input.nextFloat();
			input.nextLine();
			System.out.print("Nhap noi san pham: ");
			array[i].madeIn = input.nextLine();
			
			System.out.print("Nhap so luong san pham: ");
			array[i].quantity = input.nextShort();
			input.nextLine();
			System.out.print("San pham moi? (Y/N): ");
			char isNewChar = input.nextLine().charAt(0);
			if(isNewChar == 'Y' || isNewChar == 'y') {
				array[i].isNew = true;
			}
			else {
				array[i].isNew = false;
			}
			System.out.print("Nhap giam gia ");
			array[i].discount = input.nextFloat();
			input.nextLine();
		}
		
		//  Thực hiên thao tác trên array
		// 1. Tìm mức giá cao nhất 
		
		float max = array[0].price;
		for (int i = 1; i < size; i++) {
			if (max < array[i].price) {
				max = array[i].price;
			}
		}
		
		float min = array[0].price;
		for (int i = 1; i < size; i++) {
			if (min > array[i].price) {
				min = array[i].price;
			}
		}
		
		float total = 0;
        int count = 0;
		for (int i = 1; i < size; i++) {
				total += array[i].price * array[i].quantity;
				count += array[i].quantity;
		}
		float average = total / count;
		System.out.println("Gia tri trung binh: " + average);
		
		// Nhập vào tên, và tìm giá của sảnh phẩm 
		System.out.print("Nhap ten san pham can tim: ");
		String searchName = input.nextLine();
		boolean isFound = false;
		for (int i = 0; i < size; i++) {
			if (array[i].name.equalsIgnoreCase(searchName)) {
				System.out.println("Gia cua san pham " + searchName + " la: " + array[i].price);	
				isFound = true;
				break;
			}
			if (!isFound) {
				System.out.print("Khong tim thay san pham ");
			}
			
		}
		// Sắp xếp sản phẩm theo discount giảm dần
		// Nghĩa là: sản phẩm giảm giá nhiều nhất thì cho lên trc
		for (int i1 = 0; i1 < array.length - 1; i1++) {
		    for (int j = i1 + 1; j < array.length; j++) {
		        if (array[i1].discount < array[j].discount) {
		            Product temp = array[i1];
		            array[i1] = array[j];
		            array[j] = temp;
		        }
		    }
		}

		// Sắp xếp sản phẩm theo % giảm giá (giảm dần)
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				// Tính phần trăm giảm giá cho từng sản phẩm
				float discountPercentI = (array[i].discount/array[i].price) * 100;
				float discountPercentJ = (array[i].discount/array[i].price) * 100;
				if (discountPercentI < discountPercentJ) {
					Product temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("San pham thu: " + (i+1));
			System.out.println("Ten: " + array[i].name);
			System.out.println("Gia san pham: " + array[i].price);
			System.out.println("Noi san pham: " + array[i].madeIn);
			System.out.println("So luong: " + array[i].quantity);
			System.out.println("San pham moi? " + (array[i].isNew ? "Yes" : "No"));
			System.out.println("Giam gia: " + array[i].discount);
			System.out.println("Phan tram giam gia: " + array[i].discount * 100/array[i].price + "%");
			System.out.println("-------------------------");
		}
	
	
       
	}


}

	
