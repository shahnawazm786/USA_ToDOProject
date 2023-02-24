package org;

public class FindOutVowelFromTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="an elephant an ant an apple a papaya an aeroplane india europe";
		// object for loop
		for(char c:str.toCharArray()) {
			if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u') {
				System.out.println(c + "-> is vowel");
			}
		}
		//normal for loop
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u') {
				System.out.println(c + "-> is vowel");
			}
		}
		
	}

}
