package org.string.type;

public class LiteralString {
	public static void main(String[]args) {
		String s ="bala";
		String s1 ="bala";
		String s2 = "dishon";
		
		System.out.println("literral string");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}
	

}
