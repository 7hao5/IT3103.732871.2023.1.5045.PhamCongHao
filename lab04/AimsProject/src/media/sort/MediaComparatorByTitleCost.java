package media.sort;

import java.util.Comparator;

import aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	@Override
	public int compare(Media media1, Media media2) {
		
		int result = media1.getTitle().compareTo(media2.getTitle());
		
		if(result == 0) {
			result = Float.compare(media1.getCost(), media2.getCost());
		}
		
		return result;
	}

}
