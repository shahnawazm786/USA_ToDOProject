package org;

public class ForLoopforObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is java program";
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		String[] word=str.split(" ");
		String s="This and That|is|a|java|programing|class";
		String[] words=s.split("|");
		System.out.println(words);
		System.out.println("\n Count of word ->"+word.length);
		for(String s1 : word) {
			if(s.equals("java")) {
				System.out.println(s1);
			}
		}
		
	}

}
