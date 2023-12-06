package aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Media;
import aims.cart.Cart;
import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Track;
import aims.store.Store;

//import java.awt.PageAttributes.PrintQualityType;

// Phạm Công Hào 20215045

public class Aims {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//tạo giỏ hàng 
		Cart cart = new Cart();
		
		// tao the hien cua hang
		Store store = new Store();
		
		// tao list track
		List<Track> tracks = new ArrayList<Track>();
		
		// tạo các DVD
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Doraemon", "fukusma", "bcd", 50, 25.4f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Dragonball", "takushi", "bcbc", 75, 50f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Shinnosuke", "yamada", "cssc", 100, 12.3f);
		
		// tao cac track
		Track i = new Track("anan", 12);
		
		tracks.add(i);
		
		// tao CD
		CompactDisc CD1 = new CompactDisc("Nhac vang", "Xuan Thanh", "c", 20, 2, null, tracks);
		CompactDisc CD2 = new CompactDisc("d", "d", "d", 5, 6, null, tracks);
		CompactDisc CD3 = new CompactDisc("c", "c", "c", 10, 11, null, tracks);
		
		// them vao store
		store.addMedia(dvd3);
		store.addMedia(dvd2);
		store.addMedia(dvd1);
		store.addMedia(CD3);
		store.addMedia(CD2);
		store.addMedia(CD1);
		
		
		// menu	
		int key;
		
		do {
			
			System.out.println("Menu");
			System.out.println("------------------------------");
			System.out.println("1. View store.");
			System.out.println("2. Update store.");
			System.out.println("3. See current cart.");
			System.out.println("0. Thoat.");
			System.out.println("------------------------------");
			System.out.println("Please choose a number: 0-1-2-3.");

			key = sc.nextInt();
			
			switch (key) {
			case 0: 
				
			// chon View store
			case 1:
				
				int luaChon;
				do {
					System.out.println("Options: ");
					System.out.println("--------------------------------");
					System.out.println("1. See a media’s details");
					System.out.println("2. Add a media to cart");
					System.out.println("3. Play a media");
					System.out.println("4. See current cart");
					System.out.println("0. Back");
					System.out.println("--------------------------------");
					System.out.println("Please choose a number: 0-1-2-3-4");
					
					luaChon = sc.nextInt();
					
					switch(luaChon) {
					case 0:
						break;
						
					// Xem thông tin chi tiết của phương tiện truyền thông
					case 1:
						
						String title;
						title = sc.next();
						
						aims.media.Media x = store.seachSP(title);
						
						// hien thi thong tin cua san pham 
						x.toString();
						
						// hien thi them 3 lua chon 
						// neu san pham la CD hoac DVD thi duoc thuc hien phuong thuc play
					
						int key3;
						do {
							System.out.println("Options: ");
							System.out.println("--------------------------------");
							System.out.println("1. Add to cart");
							System.out.println("2. Play");
							System.out.println("0. Back");
							System.out.println("--------------------------------");
							System.out.println("Please choose a number: 0-1-2");
							
							key3 = sc.nextInt();
							
							switch (key3) {
							case 0:
								
								break;
							case 1: 
								
								cart.addSP(x);
								cart.soLuong();
								break;
							case 2: 
								
								if(x instanceof DigitalVideoDisc) {
									
									DigitalVideoDisc y = (DigitalVideoDisc)x;
									y.play();
								}else if(x instanceof CompactDisc){
									
									CompactDisc y = (CompactDisc)x;
									y.play();
								}else {
									
									System.out.println("san pham khong co phuong thuc play.");
								}
								break;
							}
						}while(key3 != 0);
						
						break;
					
					// Add a media to cart
					case 2:
						
						String title2;
						System.out.println("Nhap ten cua san pham: ");
						title2 = sc.next();
						
						aims.media.Media x2 = store.seachSP(title2);
						
						if(x2 != null) {
							
							cart.addSP(x2);
							cart.soLuong();
						}else {
							
							System.out.println("Khong tim thay san pham co trong cua hang.");
						}
						break;
						
					// Play a media
					case 3:
						
						String title3;
						System.out.println("Nhap ten cua san pham: ");
						title3 = sc.next();
						
						aims.media.Media x3 = store.seachSP(title3);
						
						if(x3 != null) {
							
							if(x3 instanceof DigitalVideoDisc) {
								
								DigitalVideoDisc y = (DigitalVideoDisc)x3;
								y.play();
							}else if(x3 instanceof CompactDisc){
								
								CompactDisc y = (CompactDisc)x3;
								y.play();
							}else {
								
								System.out.println("san pham khong co phuong thuc play.");
							}
							
						}else {
							
							System.out.println("Khong tim thay san pham co trong cua hang.");
						}
						break;
					
					// Xem giỏ hàng hiện tại
					case 4: 
						
						cart.printSP();
						break;
					}
				} while (luaChon != 0);
			
				break;
				
			// Update store
			case 2: 
				
				int key4;

					System.out.println("1. Them san pham vao cua hang.");
					System.out.println("2. Xoa san pham khoi cua hang.");
					
					key4 = sc.nextInt();
					
					// them san pham vao cua hang 
					if(key4 == 1) {
						
						String title; String category; float cost;
						
						title = sc.next(); category = sc.next(); cost = sc.nextFloat();
						aims.media.Media x = new aims.media.Media(title, category, cost);
						
						store.addMedia(x);
					// xoa 1 san pham khoi cua hang 
					}else if(key4 == 2) {
						
						String title3;
						System.out.println("Nhap ten cua san pham: ");
						title3 = sc.next();
						
						aims.media.Media x3 = store.seachSP(title3);
						
						if(x3 != null) {
							
							store.removeMedia(x3);
						}else {
							
							System.out.println("Khong tim thay san pham nay trong cua hang.");
						}
					}else {
						
						System.out.println("Hay chon 1 trong 2.");
					}
				break;
			// xem gio hang hien tai
			case 3: 
				
				int key5;
				do {
					
					System.out.println("Options: ");
					System.out.println("--------------------------------");
					System.out.println("1. Filter medias in cart");
					System.out.println("2. Sort medias in cart");
					System.out.println("3. Remove media from cart");
					System.out.println("4. Play a media");
					System.out.println("5. Place order");
					System.out.println("0. Back");
					System.out.println("--------------------------------");
					System.out.println("Please choose a number: 0-1-2-3-4-5");
					
					key5 = sc.nextInt();
					
					switch (key5) {
					case 0:
						
						break;
						
					// tim san pham trong cua hang theo tieu de, id
					case 1: 
						
						int key6;
						
						System.out.println("1. Tim theo title.");
						System.out.println("2. Tim theo ID.");
						
						key6 = sc.nextInt();
						
						// tim theo title
						if(key6 == 1) {
							
							String title;
							System.out.println("Nhap ten cua san pham muon tim: ");
							title = sc.next();
							
							cart.seachSP(title);
						// tim theo ID
						}else if(key6 == 2) {
							
							int id;
							System.out.println("Nhap id cua san pham ban muon tim: ");
							id = sc.nextInt();
							
							cart.seachSpId(id);
							
						}else {
							
							System.out.println("Chon 1 trong hai lua chon.");
						}
						break;
						
					// sap xep phuong tien trong gio hang
					case 2:
						
						break;
						
					// xoa phuong tien trong cua hang 
					case 3: 
						
						String title3;
						System.out.println("Nhap ten cua san pham muon xoa: ");
						title3 = sc.next();
						
						aims.media.Media x3 = store.seachSP(title3);
						
						if(x3 != null) {
							
							cart.removeSP(x3);
						}else {
							
							System.out.println("Khong ton tai san pham trong gio hang.");
						}
						break;
						
					// phat phuong tien truyen thong 
					case 4:
						
						String title4;
						System.out.println("Nhap ten cua san pham muon phat: ");
						title4 = sc.next();
						
						aims.media.Media x4 = store.seachSP(title4);
						if(x4 != null) {
							
							if(x4 instanceof DigitalVideoDisc) {
								
								DigitalVideoDisc y = (DigitalVideoDisc)x4;
								y.play();
							}else if(x4 instanceof CompactDisc){
								
								CompactDisc y = (CompactDisc)x4;
								y.play();
							}else {
								
								System.out.println("san pham khong co phuong thuc play.");
							}
							
						}else {
							
							System.out.println("Khong tim thay san pham co trong cua hang.");
						}
						break;
						
					// dat hang 
					case 5:
					
						System.out.println("Don hang cua ban da duoc tao.");
						cart.removeAll();
						break;
					}
				} while (key5 != 0);
				
				cart.printSP();
				break;
			}
		}while(key != 0);
	}
}
