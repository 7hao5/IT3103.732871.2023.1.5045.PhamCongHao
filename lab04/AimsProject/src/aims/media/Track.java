package aims.media;

import java.util.Objects;

public class Track implements Playable {
	private String title;
	private int length;
	
	// constructor
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	
	// getter and setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	// phuong thuc play
	@Override
	public void play() {
		
		System.out.println("Title: "+ this.getTitle()+ "Length: "+ this.getLength());
		
	}
	
	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(length, title);
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Track other = (Track) obj;
		return length == other.length && Objects.equals(title, other.title);
	}
	
}
