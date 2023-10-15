package JavaBasics;
// Phạm Công Hào_20215045

import javax.swing.JOptionPane;

public class Bai2_2_6PuongTrinhTuyenTinh {
	public static void main(String[] args) {
		
		// a,b là hệ số của phương trình 
		// str lưu câu trả lời của bài toán 
		double a,b,ketqua;
		String strNum1, strNum2;
		String str;
		
		// Lưu dữ liệu nhập từ bàn phím vào strNum1, strNum2
		strNum1 = JOptionPane.showInputDialog(null, "Nhap a = ", "Nhap cac he so cho phuong trinh",
				JOptionPane.INFORMATION_MESSAGE);
		
		strNum2 = JOptionPane.showInputDialog(null, "Nhap b = ", "Nhap cac he so cho phuong trinh",
				JOptionPane.INFORMATION_MESSAGE);
		
		// chuyênr từ kiểu String sang double lưu vào a, b
		a = Double.parseDouble(strNum1);
		b = Double.parseDouble(strNum2);
		
		if(a == 0 && b != 0) {
			str = "Phuong trinh vo nghiem!";
		}else if(a == 0 && b == 0){
			str = "Phuong trinh co vo so nghiem";
		}else {
			ketqua = (-b)/a;
			str = "Phuong trinh co nghiem x = "+ Double.toString(ketqua);
		}
		
		// hiển thị câu trả lời ra Dialog
		JOptionPane.showMessageDialog(null, str, "Giai Phuong trinh tuyen tinh", JOptionPane.INFORMATION_MESSAGE);
	}
}
