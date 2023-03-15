package collections;

public class MinValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value= {100,45,60,7,-10,40,90,300};
		int temp=value[0];
		System.out.println("First value in the array is "+temp);
		for(int j=0;j<value.length;j++) {
			if(value[j]<temp)
				temp=value[j];
		}
		System.out.println("Min value in the array is "+temp);
	}
}


