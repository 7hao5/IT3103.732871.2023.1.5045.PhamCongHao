package JavaBasics;

import javax.swing.JOptionPane;

public class Bai2_2_6PuongTrinhTuyenTinh {
	public static void main(String[] args) {
		
		double a,b,ketqua;
		String strNum1, strNum2;
		String str;
		
		strNum1 = JOptionPane.showInputDialog(null, "Nhap a = ", "Nhap cac he so cho phuong trinh",
				JOptionPane.INFORMATION_MESSAGE);
		
		strNum2 = JOptionPane.showInputDialog(null, "Nhap b = ", "Nhap cac he so cho phuong trinh",
				JOptionPane.INFORMATION_MESSAGE);
		
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
		
		JOptionPane.showMessageDialog(null, str, "Giai Phuong trinh tuyen tinh", JOptionPane.INFORMATION_MESSAGE);
	}
}
