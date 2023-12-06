package aims.cart;

import java.util.ArrayList;
import java.util.List;

import aims.media.DigitalVideoDisc;
import aims.media.Media;
import aims.media.Track;

// Phạm Công Hào 20215045

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	// khoi tao gio hang
	List<Media> itemsOrdered = new ArrayList<Media>();
	
	// add DigitalVideoDisc, Book, CompactDisc
	public void addSP(Media md) {
		
		if(itemsOrdered.contains(md)) {
			
			System.out.println("Da ton tai san pham trong gio hang.");
		}else {
			
			itemsOrdered.add(md);
			System.out.println("Da them vao gio hang.");
		}
	}
	
	// remove DigitalVideoDisc, Book, CompactDisc
	public void removeSP(Media md) {
		
		if(itemsOrdered.contains(md)) {
			
			itemsOrdered.remove(md);
			System.out.println("Da xoa san pham khoi gio hang.");
		}else {
			
			System.out.println("San pham khong co trong gio hang.");
		}
	}
	
	// xoa het cac san pham trong gio hang
	public void removeAll() {
		
		for(Media x: itemsOrdered) {
			
			itemsOrdered.remove(x);
		}
	}
	
	
	// hàm tính tông giá tiênf DVD trong giỏ hàng 
	public float totalCost() {
		float sum =0f;
		
		for(Media x: itemsOrdered) {
			sum += x.getCost();
		}
		return sum;
	}
	
	// hàm in thông tin tất cả các sản phẩm DVD trong giỏ hàng 
	public void printSP() {
		
		for(Media x : itemsOrdered) {
			x.toString();
		}		
	}
	
	// tim sp thong qua title
	public void seachSP(String title) {
		
		for(Media x : itemsOrdered) {
			
			if(x.getTitle().equalsIgnoreCase(title)) {
				
				x.toString();
				return; 
			}
		}
		
		System.out.println("Khong tim thay san pham.");
	}
	
	// tim sp thong qua id
	public void seachSpId(int n) {
		
		for(Media x: itemsOrdered) {
			
			if(x.getId() == n) {
				
				x.toString();
				return;
			}
		}
		
		System.out.println("Khong tim thay san pham.");
	}
	
	// ham in ra so luong cac phan tu trong gio hang
	public void soLuong() {
		
		int i=0;
		
		for(Media x : itemsOrdered) {
			i++;
		}
		
		System.out.println("So luong san pham trong gio hang hien tai: "+ i);
	}
}
