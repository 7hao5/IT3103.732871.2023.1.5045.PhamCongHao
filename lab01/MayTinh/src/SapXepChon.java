
public class SapXepChon implements SapXep {

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		double key;
		int index;
		
		for(int i=0; i<n-1; i++) {
			key = arr[i];
			index = i+1;
			
			for(int j=i+1; j<n; j++) {
				if(key > arr[j]) {
					key = arr[j];
					index = j;
				}
			}
			
			if(index != i+1) {
				arr[index] = arr[i];
				arr[i] = key;
			}
		}
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		double key;
		int index;
		
		for(int i=0; i<n-1; i++) {
			key = arr[i];
			index = i+1;
			
			for(int j=i+1; j<n; j++) {
				if(key < arr[j]) {
					key = arr[j];
					index = j;
				}
			}
			
			if(index != i+1) {
				arr[index] = arr[i];
				arr[i] = key;
			}
		}
		
	}

}
