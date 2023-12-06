package aims.media;

import java.util.Comparator;
import java.util.Objects;

import media.sort.MediaComparatorByCostTitle;
import media.sort.MediaComparatorByTitleCost;

public class Media {
	
	public static int i=0;
	private int id;
	private String title;
	private String category;
	private float cost;
	
	// 
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	
	// constructor
	public Media(String title, String category, float cost) {
		super();
		this.id = i++;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	// getter and setter
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	
	// hashCode
	@Override
	public int hashCode() {
		return Objects.hash(title);
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
		Media other = (Media) obj;
		return Objects.equals(title, other.title);
	}

	
}
