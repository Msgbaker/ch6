public class isAbecedarian{
	public static void main(String[] arg){
		System.out.println(isAbc("abca"));
	}
	public static boolean isAbc(String str){
		boolean check=false;
		int n=0;
		for(int i=0;i<str.length()-1;i++){
			n++;
			if(str.charAt(i)<str.charAt(1+i)) check=true;else check=false;
		}
		System.out.println(n);
		return check;
	}
}
