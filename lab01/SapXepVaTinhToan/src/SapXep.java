import java.util.Scanner;

public class SapXep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double arr[];
		
		System.out.println("Nhap so luong phan tu cua mang: ");
		n = sc.nextInt();
		
		arr = new double[n];
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Nhap phan tu thu "+ i+ " cua mang: ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				
				if(arr[i] > arr[j]) {
					
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Mang duoc sap xep lai");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Gia tri trung binh cua cac phan tu trong mang bang: "+ (sum/n));
	}
}
