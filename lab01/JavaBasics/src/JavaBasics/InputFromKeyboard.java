package JavaBasics;

import java.util.Scanner;

public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ten;
		int tuoi;
		double chieuCao;
		
		System.out.println("Nhap ten: "); 
		ten = sc.next();
		System.out.println("Nhap tuoi: ");
		tuoi = sc.nextInt();
		System.out.println("Nhap chieu cao: ");
		chieuCao = sc.nextDouble();
		
		System.out.println("Mrs/Ms. "+ ten+ ", "+ tuoi+ " years old. Your height is "+ chieuCao+ ".");
	}
}
