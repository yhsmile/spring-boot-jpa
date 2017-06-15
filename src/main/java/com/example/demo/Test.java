package com.example.demo;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {

		
		String name = "User";
			StringBuilder buf = new StringBuilder( name.replace('.', '_') );
			for (int i=1; i<buf.length()-1; i++) {
				if (
					Character.isLowerCase( buf.charAt(i-1) ) &&
					Character.isUpperCase( buf.charAt(i) ) &&
					Character.isLowerCase( buf.charAt(i+1) )
				) {
					buf.insert(i++, '_');
				}
			}
			String  s = buf.toString().toLowerCase(Locale.ROOT);
			System.out.println(s);
		}

}
