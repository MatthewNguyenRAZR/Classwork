package arrays6;

public class ArrayMethods {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
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
		//shuffle(arrMain);
		//print(arr);
		
		//print(getSubArray(arr,2,4));
		//System.out.println(longestConsecutiveSequence(arr));
		testPrime(10);
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
	/*
	 * returns number of elements in arr less than d
	 */
	public static int countUnderBound(double[] arr, double d){
		int ctr = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]<d){
				ctr++;
			}
		}
		return ctr;
		
	}
	/*
	 * Example:
	 * arr = [3,9,6,11,14,26]
	 * getSubArray(arr,2,4)
	 * returns[6,11,14]
	 */
	public static int[] getSubArray(int[] arr, int startIndex, int endIndex){
		int[] subArray = new int[endIndex - startIndex +1];
		for(int i = 0;i<subArray.length;i++){
			subArray[i] = arr[startIndex+i];
		}
		return subArray;
		
	}
	public static boolean contains(int[] arr, int[] subArray){
		for(int i = 0;i<arr.length;i++){
			//check the rest of the elements
			int j = 0;
			while(j<subArray.length){
				if(subArray[j] == arr[i+j] && j == subArray.length-1){
					System.out.println("Found a match at index "+i);
					return true;
				}else if(subArray[j] != arr[i]){
					System.out.println("Did not find a match");
					break;
				}
				j++;
			}
		}
		return false	;
		
	}
	public static void cycleThrough(int[] arr, int n){
		
		
	}
	public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consequtive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * int[] arr = {2,3,4,6,9,11,12,15};
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
        
        int maxChain = 0;
        int currentChain = 0;
        for(int i = 0; i < array1.length-1; i++){
            if(array1[i]==array1[i+1]-1){
                currentChain++;
            }else{
                if(currentChain>maxChain){
                    maxChain = currentChain;
                }
                currentChain=0;
            }
            System.out.println(currentChain);
        }
        return maxChain;
	}
	public static void randomNotRepetitiveArray(){
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int[] randArr = new int[arr.length-1];
		for(int i = 0;i<randArr.length;i++){
			int toAdd = arr[(int)Math.random()*arr.length];
			while(indexOf(randArr,toAdd)>-1){
				toAdd = arr[(int)Math.random()*arr.length];			
			}
			randArr[i] = toAdd;
		}
	}


	private static int indexOf(int[] arr,int toFind) {
		for(int i = 0;i<arr.length;i++){
			if(arr[i]==toFind){
				return 1;
			}
		}
		return -1;
	}
	public static void testPrime(int numberToTest){
		int lastToCheck = (int)(Math.sqrt(numberToTest));
		boolean[] theNumbers = new boolean[numberToTest];
		for(int i = 0;i<numberToTest;i++){
			theNumbers[i] = true;
		}
		theNumbers[0] = false;
		theNumbers[1] = false;
		int increment = 2;
		boolean first = true;
		for(int test = 0;test<=lastToCheck;test = test+increment){
			if(!first){
				theNumbers[test] = false;
			}else{
				first = false;
			}
		}
		for(int i = 0;i<numberToTest;i++){
			if(theNumbers[i]){
				System.out.println(i+" is prime");
			}
		}
		
	}
}
