package in.abc.main;

public class DemoApp {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40};
		for (int ele : a) {
			System.out.println(ele);
		}
		
		String name = "sachin";
		int count = name.toUpperCase().length();
		System.out.println("The length of the string is :: " + count);

	}

}
