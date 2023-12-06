package aims.media;
// Pham Cong Hao 20215045

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	// constructor
	public CompactDisc(String title, String category, String director, float cost, double lenght, String artist,
			List<Track> tracks) {
		super(title, category, director, cost, lenght);
		this.artist = artist;
		this.tracks = tracks;
	}

	// getter
	public String getArtist() {
		return artist;
	}
	
	// add Track
	public void addTrack(Track track) {
		
		if(tracks.contains(track)) {
			
			System.out.println("Da ton tai track trong CD.");
		}else {
			
			tracks.add(track);
			System.out.println("Them thanh cong track vao CD.");
		}
	}
	
	// remove track 
	public void removeTrack(Track track) {
		
		if(tracks.contains(track)) {
			
			tracks.remove(track);
			System.out.println("Xoa thanh cong.");
		}else {
			
			System.out.println("Khong ton tai trong tracks.");
		}
	}
	
	// getLength
	public int getLength() {
		
		int length = 0;
		// duyet qua tung track trong tracks lay length
		for(Track x : tracks) {
			length += x.getLength();
		}
		
		return length;
	}
	
	// phuong thuc play
	@Override
	public void play() {
		
		for(Track x : tracks) {
			x.play();
		}
		
	}
	
	// toString
	@Override
	public String toString() {
		
		String x = "";
		
		for(Track tr : tracks) {
			
			x += tr.getTitle();
			x += ",";
		}
		
		return "Thong tin cua CD: \n"+ "ID: "+ getId() + "\n"
				+ "Title: "+ getTitle()+ "\n"
				+"Category: "+ getCategory() +"\n"
				+"Cost: "+ getCost()+"\n"
				+"Director: "+ getDirector()+"\n"
				+"Length: "+ getLength()+"\n"
				+"Artist: "+ getArtist()+"\n"
				+"Danh sach cac bai hat: "+"\n"
				+x+"\n";
	}	
}
