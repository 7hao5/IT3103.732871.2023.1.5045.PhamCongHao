
public class PhanMemMayTinh implements MayTinh, SapXep {

	@Override
	public void sapXepTang(double[] arr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double cong(double a, double b) {
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		try {
			return a/b;
		} catch (Exception e) {
			System.out.println("Khong the chia mot so cho 0!");
			return -1;
		}
	}

}
