
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		TriangoloRettangolo tr = new TriangoloRettangolo(3,4);
		System.out.println("Ipotenusa: " + tr.getHyp());
		System.out.println("Area: " + tr.getArea());
		System.out.println("Perimetro: " + tr.getPerimetro());
		
		tr.setCat1(5);
		System.out.println(tr);
		
		int[] vint = new int[100];
		for(int i=0; i<100; i++) {
			vint[i] = (i+1) * 2;
		}
		for(int i=0; i<100; i++) {
			vint[i] = (i+1) * 2 - 1;
		}
		double[] vdou = new double[100];
		for(int i=1; i<=100; i++) {
			vdou[i-1] = 1.0 / i;
		}
		
		long[] vlong = new long[100];
		vlong[0] = 1;
		vlong[1] = 1;
		for(int i=2; i<100; i++) {
			vlong[i] = vlong[i-2] + vlong[i-1];
		}
		
		for(int i=0; i<100; i++) {
			vint[i] = (i+1) * 2;
		}
		
		
		
		for(int i = 1; i < 100; i++) {
			System.out.println(fattoriale(i) + " - " + fattoriale2(i));
		}
		
	}
	
	public static int fattoriale(int n) {
		return (n + 1) * n / 2 +1;
	}
	public static int fattoriale2(int n) {
		int fatt = 1;
		for(int i=n; i>=1; i--) {
			fatt += i;
		}
		return fatt;
	}
	
	
	public static void eratostene(int n) {
		boolean [] vbol = new boolean[n*n*n];
		
	}
	
	public static void stampaInt(int[] vint) {
		for(int v: vint) {
			System.out.println(v);
		}
	}
	public static void stampaInt(long[] vint) {
		for(long v: vint) {
			System.out.println(v);
		}
	}

}
