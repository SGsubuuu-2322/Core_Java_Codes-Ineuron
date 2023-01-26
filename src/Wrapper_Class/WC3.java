package Wrapper_Class;

public class WC3 {

	public static void main(String[] args) {
		Integer i = new Integer(130);
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		
		Character ch = new Character('g');
		Boolean bn = new Boolean("true");
		
		System.out.println(ch.charValue());
		System.out.println(bn.booleanValue());
		
//		System.out.println(ch.byteValue());
//		System.out.println(bn.byteValue());

	}

}
