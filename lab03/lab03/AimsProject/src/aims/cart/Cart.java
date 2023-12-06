package aims.cart;

import java.util.ArrayList;

import aims.disc.DigitalVideoDisc;

// Phạm Công Hào 20215045

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	// khoi tao gio hang
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	
	// Nạp chồng bằng cách khác loại tham số 
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {

		int soluong = dvdList.length;
		
		while(qtyOrdered < MAX_NUMBERS_ORDERED) {
			
			itemsOrdered[qtyOrdered] = dvdList[soluong];
			soluong ++;
			qtyOrdered ++;
		}
	}
	
	// truyền một số luọng đối số tùy ý cho dvd.
//	public void addDigitalVideoDisc(DigitalVideoDisc... dvd) {
//		
//		if(qtyOrdered + dvd.length < MAX_NUMBERS_ORDERED) {
//			for(DigitalVideoDisc i : dvd) {
//				itemsOrdered[qtyOrdered] = i;
//				qtyOrdered++;
//			}
//		}else {
//			System.out.println("The cart is almost full. Cannot add more discs.");
//		}
//	}
	
	// nạp chồng bằng cách khác số lượng tham số 
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
		
		if(qtyOrdered + 2 < MAX_NUMBERS_ORDERED) {
			
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
			System.out.println("The dvd1 and dvd2 has been addded.");
		}else {
			
			System.out.println("The cart is almost full. Cannot add more discs.");
		}
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been addded.");
		}else {
			System.out.println("The cart is almost full. Cannot add more discs.");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
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
	// hàm tính tông giá tiênf DVD trong giỏ hàng 
	public float totalCost() {
		float sum =0f;
		
		for(int i=0; i<qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
	
	// hàm in thông tin tất cả các sản phẩm DVD trong giỏ hàng 
	public void printDVD() {
		
		for(int i=0; i<qtyOrdered; i++) {
			int j = i+1;
			System.out.println(j+". DVD-"+itemsOrdered[i].getTitle()+ "-"+ itemsOrdered[i].getCategory()+"-"+itemsOrdered[i].getDirector()+"-"+itemsOrdered[i].getLenght()+": "+itemsOrdered[i].getCost()+"$");
		}
		
	}
	
	// Phạm Công Hào 20215045
	// hàm in ra thông tin của các DVD trong giỏ hàng và tỏng chi phí 
	public void PrintCart() {
		
		// in thông tin từng DVD theo định dạng
		for(int i=0; i<qtyOrdered; i++) {
			int j = i+1;
			System.out.println(j+". DVD-"+itemsOrdered[i].getTitle()+ "-"+ itemsOrdered[i].getCategory()+"-"+itemsOrdered[i].getDirector()+"-"+itemsOrdered[i].getLenght()+": "+itemsOrdered[i].getCost()+"$");
		}
		
		// tính tổng tiền và in ra 
		float sum =0f;
		
		for(int i=0; i<qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		
		System.out.println("Tong chi phi: "+sum);
	}
	
	// Phạm Công Hào 20215045
	// phương thức timKiem dvd có trong giỏ hàng theo id 
	public void timKiem(int id) {
		
		boolean key = false;
		
		for(int i=0; i<qtyOrdered; i++) {
			if(itemsOrdered[i].getId() == id) {
				key = true;
				System.out.println("DVD-"+itemsOrdered[i].getTitle()+ "-"+ itemsOrdered[i].getCategory()+"-"+itemsOrdered[i].getDirector()+"-"+itemsOrdered[i].getLenght()+": "+itemsOrdered[i].getCost()+"$");
			}
		}
		
		if(key == false) {
			System.out.println("Khong tim thay dvd trong gio hang!!!");
		}
	}

}
