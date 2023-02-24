package org;

public class ForLoopforObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is java program";
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println("\n\n");
		String[] word=str.split(" ");
		String s="This and That#is#a#java#programing#class#java#is#opps#java#is#robust#java#machine";
		String[] words=s.split("#");
		int cnt=0;
		for(String w:words) {
			if(w.equals("java")) {
				cnt++;
			}
			System.out.print(w+"\t");
			
		}
		System.out.println("\n\nJava words occured -> "+cnt);
		System.out.println("\n Count of word ->"+word.length);
		for(String s1 : word) {
			if(s.equals("java")) {
				System.out.println(s1);
			}
		}
		
	}

}
