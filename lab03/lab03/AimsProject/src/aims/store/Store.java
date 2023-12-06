package aims.store;
// Phạm Công Hào 20215045

import aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	// khoi tao gio hang
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	
	// thêm DVD vào cửa hàng 
	public void addDVD(DigitalVideoDisc disc) {
		
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been addded.");
		}else {
			System.out.println("The cart is almost full. Cannot add more discs.");
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		// khởi tạo biến key để kiểm tra xem có xóa thành công 1 dvd không 
		boolean key = false;
		
		// duyệt các DVD trong giỏ hàng 
		for(int i=0; i<qtyOrdered; i++) {
			
			// nếu tìm thấy dvd thì thực hiện xóa 
			if(itemsOrdered[i].equals(disc)) {
				
				// đẩy các dvd phía sau dvd cần xóa lên phía trước 1 đơn vị trong mảng
				for(int j=i; j < qtyOrdered-1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				
				// xóa phần tử cuối cùng
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered--;
				
				// cập nhật lại giá trị của key gán bằng true
				key = true;
				System.out.println("da xoa khoi mang.");
				
				break;
			}
		}
		
		if(key == false) {
			System.out.println("Khong tim thay DVD trong gio hang.");
		}
	}
}
