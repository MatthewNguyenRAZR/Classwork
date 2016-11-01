package caveExplorer6;

import java.util.Scanner;

public class CaveExplorer {
/*
player has inventory
	-map: displays all rooms

*/
	public static CaveRoom caves[][];
	public static Scanner in;
	public static CaveRoom cirrentRoom;
	public static Inventory inventory;
	
	public static void main(String[] args){
		caves = new CaveRoom[5][5];
		for(int row = 0;row < caves.length;row++){
			for(int col = 0;col < caves[row].length;row++){
				caves[row][col] = new CaveRoom("This cave has coordinates:"+row+","+col);
			}
		}
		currentRoom = caves[0][1];
		currentRoom.enter();
		
	}
}
