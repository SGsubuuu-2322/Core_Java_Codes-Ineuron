package String;

public class S1 {

	public static void main(String[] args) {
		String s1 = "SGsubuu";
		String s2 = new String("GSsubuu");
		System.out.println(s1);
		System.out.println(s2);
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder("Subuuu");
		sb.append("Gituuu");
		System.out.println(sb);

	}

}
