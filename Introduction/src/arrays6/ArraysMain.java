/*
package arrays6;

//arrays don't have methods and are not objects
//list (multiples pieces of data)
//fixed sizes 
//all elements are of the same data type
//indexed starting at 0
public class ArraysMain {
	public static void main(String[] args){
		//this is how to time how quick a computer processes
		long startTime = System.currentTimeMillis();
		//String[] someStrings = new String[100];
		//arrayIntroMethod();
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has a number equal to "+sample.getNumber());
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in "+ (endTime-startTime)+" milliseconds");
		
		
		String[] string1 = ["","",""];
		String[] string2 = new String[3];
		string2[0] = "";
		string2[1] = "";
		string2[2] = "";
		for(int index = 0; index<string2.length; index++){
			string2[index] = "value "+(index+1);
		}
		for(String s: string2){
			System.out.println(s);
		}
		
	}
	
	public static void arrayIntroMethod(){
		//construct 2 integer arrays
				//these 2 methods do the ame thing
				int[] zeros1 = {0,0,0};
				int[] zeros2 = new int[3];
				//example
				boolean[] booleans = new boolean [3];
				
				//iterate 2 ways
				
				//WHEN TO USE THIS METHOD
				 
				//FIRST METHOD
				//-when index of data is important to reference
				//-need to customize how you iterate
					//(increase by 2, backwards, etc...)
				
				for(int index = 0; index < booleans.length; index++){
					System.out.println(index+") "+booleans[index]);
				}
				//SECOND METHOD
				//-always goes in order, doesn't keep track of index
				//easier to type
				
				for(boolean b: booleans){
					System.out.println(""+b);
				}
					
				//these 2 constructors are different
				String[] strings1 = {"","",""};
				String[] strings2 = new String[3];
				
				for(String s: strings1){
					System.out.println(s);
				}
				for(String s: strings2){
					System.out.println(s);
				}
	}
}
*/
package arrays6;
import java.util.Random;
public class ArraysMain {
	static int[] OneToFifty = new int[50];
	static int[] RandomInteger = new int[50];
	
	public static void main(String[] args) {
		/*
		//timing how quickly a computer processes.
		long startTime = System.currentTimeMillis();
		
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element is now: "+sample.getNumber());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in..."+(endTime-startTime)+"ms!!");
		*/
		PopulateArrayOneToFifty();
		PopulateArrayRandomInteger();
		for(int i = 0; i < OneToFifty.length; i++){
			System.out.println(OneToFifty[i]);
		}
		System.out.println("");
		for(int i = 0; i < RandomInteger.length; i++){
			System.out.println(RandomInteger[i]);
		}
	}
	
	public static void PopulateArrayOneToFifty(){
		for(int index=0;index<OneToFifty.length;index++){
			OneToFifty[index] = index+1;
		}
	}
	public static void PopulateArrayRandomInteger(){
		for(int index=0;index<RandomInteger.length;index++){
			int RandomZerotoNinetyNine = (int) (100 * Math.random());//[0,99]
			RandomInteger[index] = RandomZerotoNinetyNine;
		}
	}
	
	private static void passByValueDemo(){
		//arrayIntroMethod();
		String[] someStrings = new String[100];
		populateArray(someStrings);
		changeString(someStrings[99]);
		System.out.println("after changeString: "+someStrings[99]);
		changeArray(someStrings);
		System.out.println("after changeArray: "+someStrings[99]);
		changeArrayElement(someStrings,99);
		System.out.println("after changeArrayElement: "+someStrings[99]);
		//printArray(someStrings);
	}
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "New item: "+(i+1);
		
	}
 
	private static void changeArray(String[] someStrings){
		someStrings = new String[100];
		for(int i=0;i<someStrings.length;i++){
			someStrings[i] = "new item "+(i+1);
		}
	}
	private static void printArray(String[] b) {
		for(String strB: b){
			System.out.println(strB);
		}
		
	}
	private static void changeString(String s){
		s ="This strng has been changed!";
	}
	private static void populateArray(String[] a) {
		for(int h=0; h<a.length;h++){
			a[h] = "Value "+(h+1);
		}
		
	}
	public static void arrayIntroMethod(){
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
		String[] strings1 = {"","",""};
		String[] strings2 = new String[3];//full of nulls
//		strings2[0] = "Value 1";
//		strings2[1] = "Value 2";
//		strings2[2] = "Value 3";
		
		for(int g=0; g<strings2.length;g++){
			strings2[g] = "Value "+(g+1);
		}
		
		for(String s1: strings1){
			System.out.println(s1);
		}
		for(String s2: strings2){
			System.out.println(s2);
		}
		
		/*boolean[] booleans =  new boolean[3];
		//index of data is important to reference.
		for(int index=0;index<booleans.length;index++){
			System.out.println(index+") "+booleans[index]);
		}
		//always goes in order, doesnt go in order
		int index2 = 0;
		for(boolean b:booleans){
			System.out.println(index2+") "+b);
			index2++;
		}*/
	}
}
