import java.util.Scanner;
// Phạm Công Hào_20215045

public class SapXep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n: Số lượng phần tử trong mảng 
		// arr[]: Mảng lưu các giá trị dược nhập vào từ bàn phím 
		// sum lưu tổng giá trị các phần tử trong mảng 
		int n;
		double arr[];
		
		System.out.println("Nhap so luong phan tu cua mang: ");
		n = sc.nextInt();
		
		arr = new double[n];
		double sum = 0;
		
		// Nhập từng phần tử của mảng 
		for(int i=0; i<n; i++) {
			
			System.out.println("Nhap phan tu thu "+ i+ " cua mang: ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		
		// Sắp xếp mảng theo thứ tự tăng dần
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				
				if(arr[i] > arr[j]) {
					
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// hiển thị mảng sau khi sắp xếp 
		System.out.println("Mang duoc sap xep lai");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		System.out.println("Gia tri trung binh cua cac phan tu trong mang bang: "+ (sum/n));
	}
}
