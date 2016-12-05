package timeComplexity;

public class TimeComplexity {
	
	public static void main(String[] args) {
		
	}
	public TimeComplexity() {
		// TODO Auto-generated constructor stub
	}
	
	public double getAverage(double[] values){
		double sum=0.0;
		for(int i = 0; i<values.length; i++){
		sum+=values[i];
		}
		return sum/values.length;
	}
	public boolean isPrime1(int n){
		boolean prime = true;	//1ms
		for(int i = 2; i<n; i++){	//2(n+1-2) = 2n-1
			if(n%i==0) prime = false;   //2(n-2)ms
		}
		return prime;	//1ms
	}
	public boolean isPrime2(int n){
		boolean prime = true;	//1ms
		for(int i = 2; i<Math.sqrt(n); i++){	//n+sqrt(n)-2
			if(n%i==0) prime = false;	//2sqrt(n)ms   
		}
			return prime;	//1ms
	}
}
