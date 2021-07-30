package org.string.type;

public class Immutable {
	public static void main(String[] args) {
		String s ="bala";
		String s1 ="bala";
		String s2 = "dishon";
		String s3 = s.concat(s1);
		System.out.println(s3);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
