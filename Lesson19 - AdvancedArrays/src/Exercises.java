
public class Exercises {

	public static void main(String[] args) {

		/*
		 * Question 7 String d = "The quick brown fox jumped over the lazy dog."; char
		 * qbf[]; qbf = d.toCharArray();
		 * 
		 * for(int i = 0; i < qbf.length; i++) { System.out.print(qbf[i] + ", "); }
		 */

		/*
		 * Question 8 double rub[] = {23.0, -102.1, 88.23, 111, 12.02, 189.119, 299.88};
		 * double dub[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 * 
		 * System.arraycopy(rub, 3, dub, 4, 3); for(int i = 0; i < dub.length; i++) {
		 * System.out.print(dub[i] + ", "); }
		 */

		// Question 9
		/*double[] zz, top = { 12.1, 13.1, 14.1, 15.1, 18 };
		zz = top;
		zz[2] = 99;
		top[3] = 100.2;

		for (int i = 0; i < top.length; i++) {
			System.out.print(top[i] + ", ");
		}
		
		System.out.println();
		
		for (int i = 0; i < zz.length; i++) {
			System.out.print(zz[i] + ", ");
			
		}*/
		
		//Question 10
		/*char[] a, b;
		a = "Groovy dude".toCharArray();
		b = "I like this".toCharArray();
		System.arraycopy(a, 1, b, 0, 4);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		
		System.out.println();
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}*/
		
		//Multiple Choice
		
		//Question 7
		/*String s1 = "abcdefghijk";
		char []x = s1.toCharArray();
		String s2 = "mnopqrstuvw";
		char []y = s2.toCharArray();
		int vv[] = {0, 1, 0, 1};
		for(int j = 0; j < vv.length; j++) {
			switch(vv[j]) {
			case 0:
				System.out.print(x[j]);
				break;
			case 1:
				System.out.print(y[j + 1]);
			}
		}*/
		
		//Question 8
		/*int a[] = {0, 1, 2, 3};
		int b[] = a;
		int sum = 0;
		for(int j = 0; j < 3; j++) {
			sum += (a[j+1] * b[j]) + (a[j] * b[j + 1]);
		}
		System.out.println(sum);*/
		
		//Question 9
		/*int []z1 = {2, 3, 4, 5, 6};
		int []z2 = {1, 2, 1, 2, 1};
		double d = 0;
		for(int j  = 0; j < 3; j++) {
			d = d + Math.pow(z1[j + 1], 2) + Math.pow(z2[j], 2);
		}
		System.out.println(d);*/
		
		//Question 10
		/*int j, src = 2, des = 3, hm = 2;
		int [] sa = {100, 200, 300, 400, 500};
		int [] da = {40, 50, 60, 70, 80};
		System.arraycopy(sa, src, da, des, hm);
		for(j = 0; j < da.length; j++) {
			System.out.print(da[j]);
		}*/
		
	}

}
