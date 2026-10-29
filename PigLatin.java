import java.util.Scanner;

public class PigLatin{
	public static void main(String[] arg){
		Scanner in=new Scanner(System.in);
		System.out.print("");
		System.out.println(pigLatin(in.nextLine()));
	}
	
	public static String pigLatin(String str){
		String word="";
		String result="";
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)!=' '){
				word+=str.charAt(i);		
			} else {
				result+=add(word);
				result+=" ";
				word="";
			}
		}
		if(word.length()>0) result+=add(word);
		return result;	
	}
	
	public static String add(String word){
		if(word.length()<=2) return word;
		return word.substring(1)+word.substring(0,1)+"ay";
	}
}
