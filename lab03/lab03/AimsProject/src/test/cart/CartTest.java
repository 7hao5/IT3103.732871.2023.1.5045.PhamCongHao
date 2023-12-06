package test.cart;
// Phạm Công Hào 20215045
import java.util.Scanner;

import aims.cart.Cart;
import aims.disc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//tạo giỏ hàng 
		Cart anOrder = new Cart();
		
		// tạo các DVD
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Doraemon", "fukusma", "bcd", 50, 25.4f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Dragonball", "takushi", "bcbc", 75, 50f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Shinnosuke", "yamada", "cssc", 100, 12.3f);
		
		//thêm các DVD vào giỏ hàng 
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		
		// in ra thông tin của các DVD có trong giỏ hàng và tổng chi phí 
		anOrder.PrintCart();
		
		// tìm dvd theo id 
		int id;
		System.out.println("Nhap id cua san pham muon tim: ");
		id  = sc.nextInt();
		anOrder.timKiem(id);

	}
}
