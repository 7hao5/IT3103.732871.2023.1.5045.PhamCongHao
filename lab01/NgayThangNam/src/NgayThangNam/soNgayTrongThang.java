package NgayThangNam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class soNgayTrongThang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strMonth, strYear;
		String str = "";
			
		do {
			
			System.out.println("Nhap thang va nam ");
			System.out.println("Thang ");
			strMonth = sc.nextLine();
			System.out.println("Nam ");
			strYear = sc.nextLine();
			
			int thang, nam;
			
			thang = extractNumber(strMonth);
			nam = extractNumber(strYear);
			
			if(thang<=0 || thang >= 13 || nam <= 0) {
				System.out.println("Hay Nhap Lai!!!");
				System.out.println("==========================");
				str = "";
			}else {
				switch (thang) {
					case 1: 
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
					{
						str = "31 Ngay";
						break;
					}
					case 4:
					case 6:
					case 9:
					{
						str = "30 Ngay";
						break;
					}
					case 2:
					{
						if((nam % 4 == 0 && nam % 100 !=0) || nam % 400 ==0 ) {
							str = "29 Ngay";
						}else {
							str = "28 Ngay";
						}
						break;
					}
					default:
					{
						System.out.println("Hay Nhap Lai!!!");
					}
				}
			}
		}while(str == "");
		
		System.out.println("Co "+ str);
	}
	
    public static int extractNumber(String text) {
        Pattern pattern = Pattern.compile("\\d+"); // \\d+ tương ứng với một hoặc nhiều chữ số
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.find()) {
            String numberStr = matcher.group(); // Lấy chuỗi con khớp
            int value = Integer.parseInt(numberStr); // Chuyển chuỗi thành số nguyên
            return value;
        } else {
            // Trường hợp không tìm thấy số trong chuỗi
            return 0; // Hoặc bạn có thể sử dụng giá trị mặc định khác tùy theo nhu cầu
        }
    }
}
