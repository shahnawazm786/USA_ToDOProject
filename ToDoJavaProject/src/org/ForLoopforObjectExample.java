package org;

public class ForLoopforObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is java program";
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		String[] word=str.split(" ");
		System.out.println("\n Count of word ->"+word.length);
		for(String s : word) {
			if(s.equals("java")) {
				System.out.println(s);
			}
		}
		// find vowel from String
		for(char c : str.toCharArray()) {
			System.out.println(c);
		}
	}

}
