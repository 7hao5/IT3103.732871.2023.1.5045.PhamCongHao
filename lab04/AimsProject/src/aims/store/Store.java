package aims.store;
// Phạm Công Hào 20215045

import java.util.ArrayList;
import java.util.List;

import aims.media.DigitalVideoDisc;
import aims.media.Media;

public class Store {
	
	// khoi tao kho hang
	List<Media> itemsStore = new ArrayList<Media>();

	// thêm DVD vào cửa hàng 
	public void addMedia(Media md) {
		
		if(itemsStore.contains(md)) {
			
			System.out.println("Trong kho hang da co san pham nay. them khong thanh cong.");
		}else {
			
			itemsStore.add(md);
			System.out.println("Them san pham thanh cong.");
		}
	}
	
	// remove san pham
	public void removeMedia(Media md) {
		
		if(itemsStore.contains(md)) {
			
			itemsStore.remove(md);
			System.out.println("Da xoa san pham khoi cua hang.");
		}else {
			
			System.out.println("Khong co san pham nay trong cua hang.");
		}
	}
	
	// tim sp thong qua title
	public Media seachSP(String title) {
		
		for(Media x : itemsStore) {
			
			if(x.getTitle().equalsIgnoreCase(title)) {
				
				return x;
			}
		}	
			
		System.out.println("Khong tim thay san pham trong cua hang.");
		return null;
	}
}
