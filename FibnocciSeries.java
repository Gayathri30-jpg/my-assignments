package week1.day2;

public class FibnocciSeries {

	public static void main(String[] args) {
		int n1 = 0,n2 = 1,n3 = 1;
		System.out.println(n1);
		for (int i = 1; i<=10; i++) {
        System.out.println(n3);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}	

	}
}
