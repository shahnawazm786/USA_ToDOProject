package collections;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		a=new int[10];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=-200;
		a[4]=600;
		a[5]=500;
		a[6]=9000;
		a[7]=6;
		a[8]=30;
		a[9]=45;
		System.out.println(a[4]);
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
