import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a, b;
		int n;
		double arr[];
		
		System.out.println("Nhap hai so a va b:");
		System.out.println("a = ");
		a = sc.nextDouble();
		System.out.println("b = ");
		b = sc.nextDouble();
		
		System.out.println("Nhap so phan tu cua mang: ");
		n = sc.nextInt();
		arr  = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Nhap phan tu thu "+ (i+1)+ "cua mang: ");
			arr[i] = sc.nextDouble();
		}
		
		MayTinhCassioFX500 mtc = new MayTinhCassioFX500();
		MayTinhVinacall mtv = new MayTinhVinacall();
		
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		
		System.out.println("a + b = "+ mtc.cong(a, b));
		System.out.println("a x b = "+ mtv.nhan(a, b));
		
		sxchen.sapXepTang(arr);
		System.out.println("Mang sau khi sap xep la: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
