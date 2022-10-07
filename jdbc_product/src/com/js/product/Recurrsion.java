package com.js.product;

public class Recurrsion {
	static int i;
	static int pro = 1;
	public static void main(String[] args) {
		m1(5);
	}

	public static void m1(int a) {		
		if(a>0) {
			pro=pro*a;
			a--;
			if(a==1) {
				System.out.println(pro);
			}
			m1(a);
		}
		
	}

}
