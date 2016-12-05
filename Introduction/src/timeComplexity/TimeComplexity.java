package timeComplexity;

public class TimeComplexity {
	
	public static void main(String[] args) {
		
	}
	public TimeComplexity() {
		// TODO Auto-generated constructor stub
	}
	
	public double getAverage(double[] values){
		double sum=0.0;							//1
		for(int i = 0; i<values.length; i++){	//2(n+1)
		sum+=values[i];							//2n
		}
		return sum/values.length;				//2
	}											//4n+5
	
	public boolean isPrime(int n){
		boolean prime = true;					//1
		for(int i = 2; i<n; i++){				//2(n+1-2) = 2n-1
			if(n%i==0) prime = false;  			//2(n-2)
		}
		return prime;							//1
	}
	
	public boolean isPrime1(int n){
		boolean prime = true;					//1
		for(int i = 2; i<Math.sqrt(n); i++){	//3(sqrt(n)-2+1)
			if(n%i==0) prime = false;			//BestCase 2(sqrt(n)-2)   	Worst Case 3(sqrt(n)-2)ms 
		}
			return prime;						//1
	}											//Best Case 5sqrt(n)-5		Worst Case 6sqrt(n)-7
	
	public boolean isPrime2(int n){
		boolean prime = true;					//1
		double sqrt = Math.sqrt(n);				//2
		for(int i = 2; i<sqrt; i++){			//2(sqrt(n)-1)
			if(n%i==0) prime = false;   		//Best Case 2(sqrt(n)-2)	Worst Case 3(sqrt(n)-2)
		}
		return prime;							//1
	}
}												//Best Case 4sqrt(n)-2		Worst Case 5sqrt(n)-4
