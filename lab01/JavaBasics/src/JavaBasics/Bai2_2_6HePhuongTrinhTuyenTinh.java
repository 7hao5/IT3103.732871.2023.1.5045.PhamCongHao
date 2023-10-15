package JavaBasics;
// Phạm Công Hào_20215045

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bai2_2_6HePhuongTrinhTuyenTinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ma trận bậc 2 arr[][] lưu hệ số của hệ phương trình
		// mảng x[] để lưu các nghiệm của hệ phương trình 
		// n1 lưu số lượng hệ phương trình 
		// strKetQua lưu câu trả lời cho hệ phương trình.
		
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
		
		// Sắp xếp các phương trình dựa trên số lượng hệ số khác 0 trong từng phương trình 
		
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
		
		// Thực hiện phép khử Gauss để đưa về hệ phương trình bậc thang
		for(int i=1; i<n; i++) {
			for(int k=i+1; k<=n; k++) {
				
				double t = arr[k][i]/arr[i][i];
				
				for(int j=1; j<=n+1; j++) {
					arr[k][j] = arr[k][j] - t * arr[i][j];
				}
			}
		}
		
		// rA là rank của ma trận hệ số x 
		// rA_ là rank ma trận hệ số của hệ phương trình 
		// n là số lượng phương trình 
		
		// rA  < rA_ => hệ phương trình vô nghiệm 
		// rA = rA_ < n => hệ phương trình có vô số nghiệm
		// rA = rA_ = n => hệ phương trình có nghiệm duy nhất
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
		
		// biện luận nghiệm của hệ phương trình theo rA, rA_, n
		
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
		
		// hiển thị câu trả lời về nghiệm của phương trình thông qua Dialog
		JOptionPane.showMessageDialog(null, strKetQua, "Nghiem cua he phuong trinh", 
									  JOptionPane.INFORMATION_MESSAGE);
	}
}
