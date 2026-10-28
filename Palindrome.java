import java.util.Scanner;

public class Palindrome{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.print("");
		System.out.println(isPalindrome(in.nextLine()));
	}
	
	public static boolean isPalindrome(String str){
		String nonLetters = ",.:;()[]{}!@#$%^&* ";
		String result="";
		String reverse="";
		for(int i=0;i<str.length();i++){
			String letter=str.substring(i,i+1);
			if(!nonLetters.contains(letter)){
				result+=str.substring(i,i+1);
			}
		}
		for(int i=0;i<result.length();i++){
			reverse+=result.charAt(result.length()-i-1);
		}
		System.out.println(reverse+" "+result);	
		return false;
	}
}
