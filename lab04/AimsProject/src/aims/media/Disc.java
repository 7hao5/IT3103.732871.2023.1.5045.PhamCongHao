package aims.media;

// Pham Cong Hao 20215045
public class Disc extends Media{
	
	private String director;
	private double lenght;
	
	// constructor
	public Disc(String title, String category, String director, float cost, double lenght) {
		super(title, category, cost);
		this.director = director;
		this.lenght = lenght;
	}
	
	// constructor
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}

	// getter
	public String getDirector() {
		return director;
	}

	public double getLenght() {
		return lenght;
	}

}
