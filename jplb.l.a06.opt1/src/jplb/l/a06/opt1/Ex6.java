/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a06.opt1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Nhập số hàng M và số cột N:");
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] matrix = new int[M][N];
        
        if (M < 1 || M > 100 || N < 1 || N > 100) {
            System.out.println("M và N phải nằm trong khoảng từ 1 đến 100.");
            return;
        }
        
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < N; j++) {
            int columnSum = 0;
            for (int i = 0; i < M; i++) {
                columnSum += matrix[i][j];
            }
            maxSum = Math.max(maxSum, columnSum);
            minSum = Math.min(minSum, columnSum);
        }
        System.out.println(maxSum + " " + minSum);
	}

}
