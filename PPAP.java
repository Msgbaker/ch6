import java.util.Scanner;

public class PPAP{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.print("");
		System.out.println(ppap(in.nextLine()));
	}
	public static String ppap(String str){
		int comma=str.indexOf(",");
		String first=str.substring(9, comma);
		String letter=str.substring(comma+11,comma+12);
		String upper=letter.toUpperCase();
		String second=upper+str.substring(comma+12);
		return "Uh! " + second + " " + first;
	} 
}
