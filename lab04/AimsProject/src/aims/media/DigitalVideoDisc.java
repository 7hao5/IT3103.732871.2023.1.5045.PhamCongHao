package aims.media;
// Phạm Công Hào 20215045

public class DigitalVideoDisc extends Disc implements Playable {
	
	// constructtor
	public DigitalVideoDisc(String title, String category, String director, float cost, double lenght) {
		super(title, category, director, cost, lenght);
	}
	
	// toString
	@Override
	public String toString() {
		
		return "Thong tin cua DVD: \n"
				+ "ID: "+ getId() + "\n"
				+ "Title: "+ getTitle()+ "\n"
				+"Category: "+ getCategory() +"\n"
				+"Cost: "+ getCost()+"\n"
				+"Director: "+ getDirector() +"\n"			
				+"Length: "+ getLenght()+"\n";
	}

	// phuong thuc play
	@Override
	public void play() {
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: "+ this.getLenght());
	}

}
