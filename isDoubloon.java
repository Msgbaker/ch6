public class isDoubloon{
	public static void main(String[] arg){
		System.out.println(isDou("bleh"));
	}
	
	public static boolean isDou(String str){
		if(str.length()%2!=0) return false;
		for(int i=0;i<str.length();i++){
			if(!check(str.charAt(i),str)) return false;
		}
		return true;
	}
	
	public static boolean check(char let, String str){
		int nums=0;
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)==let)nums++;
		}
		if(nums%2==0){
			nums=0;
			return true;
		}else return false;
	}
}
