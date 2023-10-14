
public class SapXepChen implements SapXep {

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		int j;
		double key;
		for(int i=1; i<n; i++) {
			key = arr[i];
			
			j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			
			arr[j+1] = key;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		int j;
		double key;
		for(int i=1; i<n; i++) {
			key = arr[i];
			
			j = i-1;
			while(j >= 0 && arr[j] < key) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			
			arr[j+1] = key;
		}
	}

}
