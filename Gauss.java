public class Gauss{
	public static void main(String[] arg){
		System.out.println(gauss(10,2));
		System.out.println(Math.exp(-2));
	}
	
	public static double gauss(int n, float x){
		double np=1;
		double exp=1;
		double ioral=1;
		double sum=0;
		for(int i=0;i<n;i++){
			sum+=(np*exp)/ioral;
			np*=-1;
			exp*=x*x;
			ioral*=i+1;
			
		}
		//System.out.println(np + " " +exp+" "+ioral);
		return sum;
	}
}
