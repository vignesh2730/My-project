package org.string.type;

public class NonLiteral {
public static void main(String[] args) {
	String s=new String("bala");
	String s1=new String("bala");
	String s2=new String("lokesh");
	System.out.println("non literal");
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
}
}
