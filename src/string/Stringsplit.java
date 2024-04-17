package string;

public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java is easy to learn";  
		String[] a =s1.split("\s");
		for(String d:a)
		{
			System.out.println(d);
		}
	}

}
