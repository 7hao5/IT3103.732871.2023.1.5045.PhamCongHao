package aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Book extends Disc {
	private List<String> authors = new ArrayList<String>();

	// constructor
	public Book(String title, String category, float cost, List<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}

	//getter
	public List<String> getAuthors() {
		return authors;
	}
	
	// add Author
	public void addAuthor(String nameAuthor) {
		
		authors.add(nameAuthor);
		System.out.println("Them thanh cong.");
	}
	
	//remove Author
	public void removeAuthor(String nameAuthor) {
		
		boolean key = true;
		for(String name : authors) {
			
			if(name == nameAuthor) {
				
				key = false;
				authors.remove(nameAuthor);
				System.out.println("Xoa thanh cong.");
				break;
			}
		}
		
		if(key) {
			System.out.println("Khong tim thay tac gia.");
		}
	}
	
	// toString
	@Override
	public String toString() {
		
		String tacGias = " ";
		
		for(String x : authors) {
			tacGias += x;
			tacGias += ",";
		}
		
		return "Thong tin cua Book: \n"
				+ "ID: "+ getId() + "\n"
				+ "Title: "+ getTitle()+ "\n"
				+"Category: "+ getCategory() +"\n"
				+"Cost: "+ getCost()+"\n"
				+"Director: "+ getDirector() +"\n"			
				+"Danh sach cac tac gia: "+"\n"
				+tacGias+"\n";
	}
}
