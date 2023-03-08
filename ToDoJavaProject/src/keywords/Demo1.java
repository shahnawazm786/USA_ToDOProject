package keywords;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass pc=new ParentClass();
		ParentClass pc1=new ParentClass("Java");
		ParentClass pc2=new ParentClass("Java","New Delhi");
		ParentClass d=new DeriviedClass();
		ParentClass d1=new DeriviedClass("C#");
		ParentClass d2=new DeriviedClass("C#","USA");
	}

}
