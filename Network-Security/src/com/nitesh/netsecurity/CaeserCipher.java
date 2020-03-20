package com.nitesh.netsecurity;

import java.util.Scanner;

/*
 * An example of Caeser Ciphering
 * It takes an input(in upper case) and key from user
 * And ciphers and deciphers data
 */

public class CaeserCipher {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER TEXT : ");
		String plainText = sc.nextLine().toUpperCase();
		System.out.println("ENTER KEY  : ");
		int key = sc.nextInt();
		String cipherText = doEncrypt(plainText, key);
		System.out.println("cipherText : " + cipherText);
		System.out.println("plainText  : " + doDecrypt(cipherText, key));
	}

	static String doEncrypt(String plainText, int key) {
		String temp = "";
		int offset = 65;
		
		for(char ch : plainText.toCharArray()) {
			int num = ch - offset + key;
			if(num >= 26) {
				num -= 26;
			}
			temp = temp + (char)(num + offset);
		}
		
		return temp;
	}
	
	static String doDecrypt(String cipherText, int key) {
		return doEncrypt(cipherText, 26 - key);
	}
}
