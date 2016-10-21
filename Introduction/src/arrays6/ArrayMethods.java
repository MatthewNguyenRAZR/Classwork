package arrays6;

public class ArrayMethods {
	public static void main(String[] args){
		int[] arr = {2,3,4,6,9,11,12,15};
		if(checkHalfway(arr,12,0,arr.length-1)){
			System.out.println("The number you are searching for is "
					+ "less than the value of the middle array");
		}else{
			System.out.println("The number you are searching for is " 
					+ "greater than or equal to the value of the middle array");
		}
	}
	
	/*
	 * returns true if searchValue is less then element halfway between beginning and end
	 * @param arr the int[] to be searched
	 * @param i
	 * @param j
	 * @param length
	 */
	private static boolean checkHalfway(int[] arr,int searchValue,int begin, int end){
		return searchValue < arr[(begin+end)/2];
	}
}
