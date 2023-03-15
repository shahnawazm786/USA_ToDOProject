package collections;

public class ArrayExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {100,200,300};
		// the size of a will be 3
		// index 0-2
		try {
		System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index out of bound ->"+a.length);
			ae.printStackTrace();
		}
	}

}
