package JavaBasics;
// Phạm Công Hào_20215045

import javax.swing.JOptionPane;

public class Bai2_2_5 {
	public static void main(String[] args) {
		
		double a, b;
		String ketqua;
		String strNum1, strNum2;
		String str ;
		
		// Nhập hai số thông qua Dialog
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: "," Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Pleease input the second number:","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		// chuyển kiểu dữ liệu String => double
        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);

        double tong = a+b;
        double chenhlech = Math.abs(a-b);
        double tich = a*b;
        String thuong;
        
        // kiểm tra điều kiện b!=0
        if(b != 0){
			double T = a/b;
			thuong = Double.toString(T);
			
		}else{
			thuong = "Khong the chia 1 so cho 0!";
		}

		str = "Tong cua hai so: "+ tong+ "\nChenh lech: "+ chenhlech+ "\nTich: "+ tich+ "\nTh"
				+ "thuong: "+ thuong;
		// hiển thị kết quả tính toán ra Dialog 
		JOptionPane.showMessageDialog(null, str,
				"Show tow numbers", JOptionPane.INFORMATION_MESSAGE);
	}
}
