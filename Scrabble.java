public class Scrabble{
	public static void main(String[] arg){
		System.out.println(canSpell("aehdfhp","heap"));
	}
	public static boolean canSpell(String str, String word){
		str.toLowerCase();
		if(str.length()<word.length())return false;
		for(int i=0; i<str.length();i++){
			if(haveWord(str,str.charAt(i))){
				if(i>0)str=str.substring(0,i-1)+"0"+str.substring(i+1);else{
					str="0"+str.substring(i+1);
				}
			}else return false;
		}
		
		return true;
	}
	
	public static boolean haveWord(String str, char let){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==let)return true;
		}
		return false;
	}
}
