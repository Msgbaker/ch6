import java.util.Scanner;

public class Binary{
	public static void main(String[] arg){
		Scanner in= new Scanner(System.in);
		System.out.print("");
		System.out.println(binary(in.nextInt()));
	}
	
	public static String binary(int num){
		String reverse="";
		String result="";
		int remainder=num%2;
		while(num>0){
			reverse+=remainder;
			num=num/2;
			remainder=num%2;	
		}
		for(int i=0;i<reverse.length();i++){
			result+=reverse.charAt(reverse.length()-i-1);
		}
		return result;
	}
}
