package media.sort;

import java.util.Comparator;

import aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	@Override
	public int compare(Media media1, Media media2) {
		
		int result = Float.compare(media1.getCost(), media2.getCost());
		
		if(result == 0) {
			result = media1.getTitle().compareTo(media2.getTitle());
		}
		
		return result;
	}
}
