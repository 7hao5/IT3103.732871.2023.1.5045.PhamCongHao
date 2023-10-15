package TamGiacCan;
// Phạm Công Hào_20215045

import java.util.Scanner;

public class tamGiaCan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n: chiều cao của tam giác
		int n;
		
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		
        for (int i = 1; i <= n; i++) {
            // In các khoảng trắng để căn lề trái
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }     
            System.out.println();
        }
	}
}
