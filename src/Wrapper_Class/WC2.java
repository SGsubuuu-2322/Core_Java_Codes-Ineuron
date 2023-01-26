package Wrapper_Class;

public class WC2 {

	public static void main(String[] args) {
		Integer in1 = Integer.valueOf("100", 2);
		System.out.println(in1);
		System.out.println("MAX_RADIX = " + Character.MAX_RADIX);
		System.out.println("MIN_RADIX = " + Character.MIN_RADIX);
		
		in1 = Integer.valueOf("010", 8);
		System.out.println(in1);
		
		
		in1 = Integer.valueOf("001", 16);
		System.out.println(in1);
	}

}
