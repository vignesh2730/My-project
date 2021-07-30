package org.string.type;

public class mutable {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("bala");
		StringBuffer s1 = new StringBuffer("bala");
		StringBuffer s2 = new StringBuffer("vicky");
		StringBuffer s3 = s.append(s2);
		System.out.println(s3);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}


}
