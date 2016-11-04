package caveExplorer6;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayIntro {
	
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main(String[] args) {
		//int[] arr = {0,1,2,3,4,5,6,7};
		//System.out.println(Arrays.toString(arr));
		 
		//rows, columns
		//rows = arr2D.length;
		//columns = arr2D[0].length;
			
		//iterate row by row
		arr2D = new String[5][4];
		pic = new String[5][4];
		
		for(int row = 0;row<arr2D.length;row++){
			for(int col = 0;col<arr2D[row].length;col++){
				arr2D[row][col] = "("+row+","+col+")";
			}
		}
		i = 2;
		j = 3;
		in = new Scanner(System.in);
		//print each row
		/*
		for(int row = 0;row<arr2D.length;row++){
			System.out.println(Arrays.toString(arr2D[row]));
		}
		*/
		
		startExploring();
	}
	public static void startExploring() {
		while(true){
			printPic(pic);
			System.out.println("You are in room"+arr2D[i][j]);
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter w, a, s, d.");
				input = in.nextLine();
			}
			interpretInput(input.toLowerCase());
		}
	}
	private static void interpretInput(String input) {
		int iOrig = i;
		int jOrig = j;
		
		if(input.equals("w") && i>0)i--;
		else if(input.equals("a") && j>0)j--;
		else if(input.equals("s") && i<arr2D.length-1)i++;
		else if(input.equals("d") && j<arr2D[0].length-1)j++;
		
		if(iOrig==i&&jOrig==j){
			System.out.println("You can no longer move farther in that direction.");
		}
	}
	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String[] keys = {"w","a","s","d"};
		for(String key:keys){
			if(key.equals(lc))return true;
		}
		return false;
	}
	public static void printPic(String[][] pic){
		for(int row = 0;row < pic.length;row++){
			for(int col = 0;col < pic[row].length;col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
	}

}
