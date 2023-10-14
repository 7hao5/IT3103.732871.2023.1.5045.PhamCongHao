package MaTran;

import java.util.Scanner;

public class MaTran {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double maTran1[][];
		double maTran2[][];
		double maTranKetQua[][];
		
		int soHang, soCot;
		
		System.out.println("Nhap so hang: ");
		soHang = sc.nextInt();
		System.out.println("Nhap so cot: ");
		soCot = sc.nextInt();
		
		maTran1 = new double[soHang][soCot];
		maTran2 = new double[soHang][soCot];
		maTranKetQua = new double[soHang][soCot];
		
		System.out.println("Nhap du lieu cho ma tran thu nhat ");
		maTran1 = nhapDuLieuMaTran(soHang, soCot, maTran1);
		System.out.println("====================================");
		
		System.out.println("Nhap du lieu cho ma tran thu hai ");
		maTran2 = nhapDuLieuMaTran(soHang, soCot, maTran2);
		System.out.println("====================================");
		
		maTranKetQua = congHaiMaTran(soHang, soCot, maTran1, maTran2, maTranKetQua);
		
		System.out.println("Ket qua khi cong ma tran 1 voi ma tran 2 ");
		inMaTran(soHang, soCot, maTranKetQua);
	}
	
	public static double[][] nhapDuLieuMaTran(int soHang, int soCot, double arr[][]) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<soHang; i++) {
			for(int j=0; j<soCot; j++) {

				System.out.print("Nhập giá trị cho hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
				arr[i][j] = sc.nextDouble();
			}
		}
		return arr;
	}
	
	public static double[][] congHaiMaTran(int soHang, int soCot, double arr1[][], double arr2[][], double arr3[][]){
		
		for(int i=0; i<soHang; i++) {
			for(int j=0; j<soCot; j++) {
				
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return arr3;
	}
	
	public static void inMaTran(int soHang, int soCot, double arr[][]) {
		
		for(int i=0; i<soHang; i++) {
			for(int j=0; j<soCot; j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			
			System.out.println();
		}
	}
}
