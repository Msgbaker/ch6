public class sqrt{
	public static void main(String[] arg){
		System.out.print(squareRoot(9));
	}
	
	public static double squareRoot(double n){
		double guess=n/2;
		while(Math.abs(Math.pow(guess,2)-n)>=0.0001){
			guess=(guess+n/guess)/2;
		}
		return guess;
	}
}
