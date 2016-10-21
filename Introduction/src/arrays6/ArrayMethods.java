package arrays6;

public class ArrayMethods {
	public static void main(String[] args){
		int[] arr = {2,3,4,6,9,11,12,15};
		/*
		if(checkHalfway(arr,12,0,arr.length-1)){
			System.out.println("The number you are searching for is "
					+ "less than the value of the middle array");
		}else{
			System.out.println("The number you are searching for is " 
					+ "greater than or equal to the value of the middle array");
		}
		
		swap(arr,0,arr.length-1);
		*/
		shuffle(arr);
		print(arr);
	}
	
	
	private static void print(int[] arr) {
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+", ");
		}
		System.out.println(arr.length-1);
	}


	private static void shuffle(int[] arr) {
		for(int i = 0;i<arr.length;i++){
			int random = (int)(Math.random()*arr.length);
			swap(arr,i,random);
		}
		
	}
	/*
	 * returns true if searchValue is less then element halfway between beginning and end
	 * @param arr the int[] to be searched
	 * @param i
	 * @param j
	 * @param length
	 */
	//checks if value is less than the the value that is halfway into the array
	private static boolean checkHalfway(int[] arr,int searchValue,int begin, int end){
		return searchValue < arr[(begin+end)/2];
	}
	
	//swaps 2 items in array
	private static void swap(int[] arr,int i,int j){
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}
}
