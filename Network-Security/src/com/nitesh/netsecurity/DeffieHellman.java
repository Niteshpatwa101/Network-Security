package com.nitesh.netsecurity;

import java.math.BigInteger;
import java.util.Scanner;

public class DeffieHellman {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger n,p,x,y,k1,k2,A,B;
		
		System.out.println("Enter 2 prime numbers : ");
		n = new BigInteger(sc.next());
		p = new BigInteger(sc.next());
		
		System.out.println("Person A : Enter your secret number :");
		x = new BigInteger(sc.next());
		A = p.modPow(x, n);
		
		System.out.println("Person B : Enter your secret number :");
		y = new BigInteger(sc.next());
		B = p.modPow(y, n);
		
		k1 = B.modPow(x, n);
		k2 = A.modPow(y, n);
		
		System.out.println("A's secret key : " + k1);
		System.out.println("B's secret key : " + k2);
	}

}
