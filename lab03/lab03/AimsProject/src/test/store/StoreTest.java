package test.store;

import aims.disc.DigitalVideoDisc;
import aims.store.Store;

// Phạm Công Hào 20215045
public class StoreTest {
	public static void main(String[] args) {
		//tạo giỏ hàng 
		Store anOrder = new Store();
		
		// tạo các DVD
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Doraemon", "fukusma", "bcd", 50, 25.4f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Dragonball", "takushi", "bcbc", 75, 50f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Shinnosuke", "yamada", "cssc", 100, 12.3f);
		
		//thêm các DVD vào giỏ hàng 

		anOrder.addDVD(dvd1);
		anOrder.addDVD(dvd2);
		anOrder.addDVD(dvd3);
		
		// xóa dvd3 ra khỏi cửa hàng
		anOrder.removeDVD(dvd3);
	}
}
