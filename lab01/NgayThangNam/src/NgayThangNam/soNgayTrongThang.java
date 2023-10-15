package NgayThangNam;
// Phạm Công Hào_20215045

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class soNgayTrongThang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// str lưu câu trả lời số ngày trong 1 tháng bất kỳ 
		String strMonth, strYear;
		String str = "";
		
		// Sử dụng vòng lặp yêu cầu người dùng nhập lại nếu như nhập sai
		do {
			
			System.out.println("Nhap thang va nam ");
			System.out.println("Thang ");
			strMonth = sc.nextLine();
			System.out.println("Nam ");
			strYear = sc.nextLine();
			
			int thang, nam;
		
			// tách lấy tháng và năm có trong String strMonth, strYear
			thang = extractNumber(strMonth);
			nam = extractNumber(strYear);
			
			if(thang<=0 || thang >= 13 || nam <= 0) {
				System.out.println("Hay Nhap Lai!!!");
				System.out.println("==========================");
				str = "";
			}else {
				switch (thang) {
				
				// thang=[1,3,5,7,8,10,12] => có 31 ngày 
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
				// thang=[4,6,9] => co 30 ngày 
					case 4:
					case 6:
					case 9:
					{
						str = "30 Ngay";
						break;
					}
				// thang = 2;
				// năm nhuận => có 29 ngày 
				// không nhuận => 28 ngày 
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
	
	// Hàm extractNumber tách lấy số co strong 1 chuỗi được đưa vào 
    public static int extractNumber(String text) {
    	
    	// \\d+ tương ứng với một hoặc nhiều chữ số
        Pattern pattern = Pattern.compile("\\d+"); 
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.find()) {
        	
        	// Lấy chuỗi con khớp
            String numberStr = matcher.group(); 
            
            // Chuyển chuỗi thành số nguyên
            int value = Integer.parseInt(numberStr); 
            return value;
        } else {
        	
            // Trường hợp không tìm thấy số trong chuỗi
            return 0;
        }
    }
}
