package Lista1;

public class ex3 {
	public static void main(String[] args) {
		short s1, s2, s3;
		long long1, long2, long3;
		double d1, d2, d3;
		float f1, f2, f3;
		
		s1 = 5;
		s2 = 10;
		long1 = 55555555555l;
		long2 = 66666666666l;
		d1 = 3.4;
		d2 = 5.99;
		f1 = 3.4f;
		f2 = 5.99f;

		s3 = (short) (s1 + s2);
		System.out.println("s3: " + s3);
		
		long3 = long1 + long2;
		System.out.println("long3: " + long3);
		
		d3 = d1 + d2;
		System.out.println("d3: " + d3);
		
		f3 = f1 + f2;
		System.out.println("f: " + f3);
	}

}
