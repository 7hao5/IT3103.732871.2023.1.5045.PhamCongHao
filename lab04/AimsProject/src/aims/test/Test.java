package aims.test;

// Pham Cong Hao 20215045
import java.sql.SQLInvalidAuthorizationSpecException;
import java.util.ArrayList;
import java.util.List;

import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Media;
import aims.media.Track;

public class Test {
	
	public static void main(String[] args) {
		
		// tạo một list Media 
		List<Media> mediae = new ArrayList<Media>();
		
		// tạo 1 list chứa tên của các tác giả 
		List<String> tacGia = new ArrayList<String>();
		tacGia.add("Hao");
		
		// tạo một list các track có trong mỗi cd
		List<Track> tracks = new ArrayList<Track>();
		Track tck = new Track("Thu cuoi", 12);		
		tracks.add(tck);
		
		// tạo các đối tuọng Book, DigitalVideoDisc, CompactDisc
		Book b = new Book("Cay tre tram dot", "Truyen", 22.0f, tacGia);
		DigitalVideoDisc dvd = new DigitalVideoDisc("Meo may", "Truyen", "Dat", 12.0f, 12.5f);
		CompactDisc cd = new CompactDisc("Doraemon", "Truyen", "Ramada", 50f, 20f, "abc", tracks);
	
		// add media
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(b);
	
		// duyệt từng phần tử, in ra thông tin thông qua toString 
		for(Media x : mediae) {
			System.out.println(x.toString());
		}
	}
}
