package test.disc;

import aims.disc.DigitalVideoDisc;

// Phạm Công Hào 20215045
public class TestPassingParameter {
	
	public static void main(String[] args) {
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());

		// tạo lớp bao bọc cho hai đối tuọng jungleDVD và cinderellaDVD
		Wrapper cw1 = new Wrapper(jungleDVD);
		Wrapper cw2 = new Wrapper(cinderellaDVD);
		
		// hoán đổi hai đối tượng 
		swap2(cw1, cw2);
		
		// kiểm tra kết quả của hàm Wrap
		System.out.println("jungle dvd title: " + cw1.dvd.getTitle());
		System.out.println("cinderella dvd title: " + cw2.dvd.getTitle());
		
		System.out.println(jungleDVD.toString());
		System.out.println(cinderellaDVD.toString());
		
		
	}
	
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		
		DigitalVideoDisc dvdnew = dvd1;
		dvd1 = dvd2;
		dvd2 = dvdnew;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	// hàm swap2 hoán đổi chính xác hai đối tượng 
	// tạo lớp bao bọc cho hai đối tượng sử dụng class Wrapper
	public static void swap2(Wrapper cw1, Wrapper cw2) {
		DigitalVideoDisc dvd = cw1.dvd;
		cw1.dvd = cw2.dvd;
		cw2.dvd = dvd;
	}
	
}
