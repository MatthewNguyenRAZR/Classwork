package caveExplorer6;

import java.util.Scanner;

public class CaveExplorer {
/*
player has inventory
	-map: displays all rooms

*/
	public static CaveRoom caves[][];
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;
	
	public static void main(String[] args){
		in = new Scanner(System.in);
		
		caves = new CaveRoom[5][5];
		for(int row = 0;row < caves.length;row++){
			for(int col = 0;col < caves[row].length;row++){
				caves[row][col] = new CaveRoom("This cave has coordinates:"+row+","+col);
			}
		}
		currentRoom = caves[0][1];
		currentRoom.enter();
		caves[0][1].setConnection(CaveRoom.EAST,caves[0][2], new Door());
		caves[0][2].setConnection(CaveRoom.EAST,caves[1][2], new Door());
		caves[1][2].setConnection(CaveRoom.EAST,caves[2][2], new Door());
		startExploring();
	}

	private static void startExploring() {
		while(true){
			System.out.println(inventory.getDescription());
			System.out.println(currentRoom.getDescription());
			System.out.println("What would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
		
	}
}
