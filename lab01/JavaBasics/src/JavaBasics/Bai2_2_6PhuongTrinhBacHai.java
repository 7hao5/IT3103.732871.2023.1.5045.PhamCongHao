package JavaBasics;
// Phạm Công Hào_20215045

import javax.swing.JOptionPane;

public class Bai2_2_6PhuongTrinhBacHai {
	public static void main(String[] args) {
		
		// hệ số của phương trình bậc hai được lưu vào a, b, c
		// str lưu kết quả của bài toán 
		double a, b, c, denta;
		String strNum1, strNum2, strNum3, str;
		double x1, x2;
		
		// các hệ số nhập từ dialog được lưu tàm vào strNum1, strNum2, strNum3
		strNum1 = JOptionPane.showInputDialog(null, "Nhap a = ", "Nhap he so cho phuong trinh bac hai", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Nhap b = ", "Nhap he so cho phuong trinh bac hai", JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null, "Nhap c = ", "Nhap he so cho phuong trinh bac hai", JOptionPane.INFORMATION_MESSAGE);
		
		// chuyển dữ liệu kiểu String sang double
		a = Double.parseDouble(strNum1);
		b = Double.parseDouble(strNum2);
		c = Double.parseDouble(strNum3);
		
		// a!= 0 là điều kiện bắt buộc 
		// tính denta và xét các trường hợp 
		if(a == 0) {
			str = "a khac 0 la dieu kien bat buoc!";
		}else {
			denta = b*b - 4*a*c;
				
			if(denta < 0) {
				str = "Phuong trinh vo nghiem!";
			}else {
				double canDenta = Math.sqrt(denta);
					
				if(canDenta == 0) {
					x1 = (-b)/(2*a);
					str = "Phuong trinh co nghiem kep x = "+ x1;
				}else {
					x1 = (-b-canDenta)/(2*a);
					x2  =(-b+canDenta)/(2*a);
						
					str = "Phuong trinh co hai nghiem phan biet\n"+ "x1 = "+ x1+ "\nx2 = "+ x2;
				}
			}
		}
		
		// hiển thị kết quả của bài toán ra Dialog 
		JOptionPane.showMessageDialog(null, str, "Nghiem cua phuong trinh bac hai", JOptionPane.INFORMATION_MESSAGE);	
	}
}
