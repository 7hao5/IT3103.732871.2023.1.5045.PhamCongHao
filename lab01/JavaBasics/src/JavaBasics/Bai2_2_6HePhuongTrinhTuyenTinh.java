package JavaBasics;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bai2_2_6HePhuongTrinhTuyenTinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double arr[][] = new double[100][100];	
		double n1;
		String soLuongHePhuongTrinh, strKetQua;
		double x[] = new double[100];
		
		soLuongHePhuongTrinh = JOptionPane.showInputDialog(null, "Nhap n: ", "Nhap so luong he phuong trinh", JOptionPane.INFORMATION_MESSAGE);
		n1 = Double.parseDouble(soLuongHePhuongTrinh);
		int n = (int)n1;
		// Nhap he so cho cac phuong trinh
		for(int i=1; i<=n; i++) {
			for(int j =1; j<=n+1; j++) {
				
				String value;
				value = JOptionPane.showInputDialog(null, "A["+i+"]["+j+"] = ","Nhap he so cho phuong trinh thu "+ i, JOptionPane.INFORMATION_MESSAGE);
				
				arr[i][j] = Double.parseDouble(value);
			}
		}
		
		// Sap xep cac phuong trinh theo so luong cac he so khac 0 co trong phuong trinh
		// Muc dich de co the tim ra cac truong hop vo so nghiem, va de dua ve ma tran tam giac tren
		
		for(int i=1; i<n; i++) {
			for(int k=i+1; k <=n; k++) {
				
				if(arr[i][i] < arr[k][i]) {
					for(int j=1; j<=n+1; j++) {
						
						double t = arr[i][j];
						arr[i][j] = arr[k][j];
						arr[k][j] = t;
					}
				}
			}
		}
		
		// Thuc hien phep khu Gauss dua ve ma tran bac thang
		for(int i=1; i<n; i++) {
			for(int k=i+1; k<=n; k++) {
				
				double t = arr[k][i]/arr[i][i];
				
				for(int j=1; j<=n+1; j++) {
					arr[k][j] = arr[k][j] - t * arr[i][j];
				}
			}
		}
		
		// rA la rank cua ma tran he so cua x 
		// rA_ la rank cua ma tran he so cua pt
		// n la so phuong trinh
		
		// rA  < rA_ => he phuong trinh vo nghiem
		// rA = rA_ < n => he phuong trinh co vo so nghiem
		// rA = rA_ = n => he phuong trinh co nghiem duy nhat
		int rA = 0;
		int rA_ = 0;
		
		for(int i=1; i<=n; i++) {
			
			int key = 0;
			for(int j=1; j<=n; j++) {
				
				if(arr[i][j] != 0) key = 1;
			}
			
			if(key == 1) {		
				rA ++;
				rA_ ++;
			}else if(key == 0 && arr[i][n+1]!=0) {		
				rA_ ++;
			}else {
				continue;
			}
		}
		
		// bien luan nghiem cua he phuong trinh theo rA, rA_, n
		
		if(rA != rA_) {
			strKetQua = "He phuong trinh vo nghiem!";
		}else if(rA == rA_ && rA < n) {
			strKetQua = "He phuong trinh co vo so nghiem!";
		}else {
			x[n] = arr[n][n+1]/arr[n][n];
			
			for(int i=n-1; i>=1; i--) {
				double sum = 0;
				
				for(int j=i+1; j<=n; j++) {
					sum = sum+arr[i][j]*x[j];
				}
				x[i] = (arr[i][n+1]-sum)/arr[i][i];
			}
			strKetQua = "";
			for(int i=1; i<=n; i++) {
				strKetQua = strKetQua+ "Nghiem x"+ i+ " = "+ x[i]+ "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, strKetQua, "Nghiem cua he phuong trinh", JOptionPane.INFORMATION_MESSAGE);
	}
}
