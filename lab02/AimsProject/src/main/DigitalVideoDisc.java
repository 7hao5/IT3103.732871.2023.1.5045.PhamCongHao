package main;
// Phạm Công Hào 20215045

public class DigitalVideoDisc {
	
	private String title;
	private String category;
	private String director;
	private double lenght;
	private float cost;
	
	// tạo đối tượng DVD theo title
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	
//	// tạo đối tượng DVD theo danh mục	
//	public DigitalVideoDisc(String category) {
//		this.category = category;
//	}
//	
	// tạo đối tượng DVD theo category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {

		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	// tạo đối tương DVD theo title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, double lenght, float cost) {

		this.title = title;
		this.category = category;
		this.director = director;
		this.lenght = lenght;
		this.cost = cost;
	}
	
	// các hàm geter 
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public double getLenght() {
		return lenght;
	}
	public float getCost() {
		return cost;
	}
	
	// hàm trả về thông tin của DVD
	@Override
	public String toString() {
		return "DigitalVideoDisc [title=" + title + ", category=" + category + ", director=" + director + ", lenght="
				+ lenght + ", cost=" + cost + "]";
	}
	

}
