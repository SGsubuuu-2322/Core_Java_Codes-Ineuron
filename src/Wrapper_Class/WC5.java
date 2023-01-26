package Wrapper_Class;

public class WC5 {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(2322);
		System.out.println(i);
		
		String s1 = Integer.toString(100);
		System.out.println(s1);
		
		String s2 = Boolean.toString(false);
		System.out.println(s2);
		
		String s3 = Character.toString('g');
		System.out.println(s3);
		
		System.out.println();
		
		String s4 = Integer.toString(23,2);
		String s5 = Integer.toString(22,8);
		String s6 = Integer.toString(14,16);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		System.out.println();
		
		String s7 = Integer.toBinaryString(23);
		String s8 = Integer.toOctalString(22);
		String s9 = Integer.toHexString(14);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		

	}

}
