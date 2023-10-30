package main;
import java.awt.PageAttributes.PrintQualityType;
import java.util.Scanner;

// Phạm Công Hào 20215045

public class Aims {
	public static void main(String[] args) {
		
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
		
		// in ra tổng số tiền của các scanr phẩm DVD trong giỏ hàng 
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		System.out.println("\n");
		
		// in ra thông tin của các DVD trong giỏ hàng 
		anOrder.printDVD();
		System.out.println("\n");
		
		// xóa dvd3
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("\n");
		anOrder.printDVD();

	}
}
