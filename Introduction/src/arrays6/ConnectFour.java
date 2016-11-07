package arrays6;
import java.util.Scanner;

public class ConnectFour {
	
	public static Scanner in;
	public static String table[][];
	
	public static void main(String[] args){
		table = new String[7][5];
		for(int c = 0;c < table[0].length;c++){
			for(int r = 0;r < table.length;r++){
				table[r][c] = " ";
			}
		}
		in = new Scanner(System.in);
		printConnectFour(7,5);
		placeToken(askForPlacement());
	}
	private static void printConnectFour(int row, int col){
		for(int c = 0;c < col;c++){
			System.out.print(" "+c+" ");
		}
		System.out.println();
		for(int c = 0;c < col;c++){
			
			//left and right and bottom of room walls
			for(int r = 0;r < row;r++){
				if(r<row-1){
					System.out.print("|"+table[r][c]);
				}else{
					System.out.println("|"+table[r][c]+"|");
				}
			}
		}
	}
	private static int askForPlacement(){
		System.out.println("Where do you want to place the token?");
		String input = in.nextLine();
		System.out.println(input);
		for(int i = 0;i<table.length;i++){
			if(input.equals(i)){
				return i;
			}
		}
		return -1;
	}
	private static void placeToken(int c){
		int r = table.length;
		if(c==-1){
			System.out.println("Please pick between 0 and "+table.length+".");
		}else{
			while(r>0){
				if(table[r][c]=="O"){
					r--;
				}else{
					table[r][c]="O";
				}
			}
		}
	}
	
}
