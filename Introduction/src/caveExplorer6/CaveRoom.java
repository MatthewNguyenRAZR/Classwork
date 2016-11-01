package caveExplorer6;

public class CaveRoom {
/*
4 walls
caveRoom[] = borderingRooms
Door[] doors
controls: w,a,s,d (space) to do activity
contents in each room (including you) ex: treasure,key
each room has description
*/
	private String description;
	private String contents;
	private String defaultContents;
	private String directions;
	
	private Door[] doors;
	private String[] borderingRooms;
	
	private static final int NORTH = 0;
	private static final int EAST = 1;
	private static final int WEST = 2;
	private static final int SOUTH = 3;
	
	public CaveRoom(String description){
		this.description = description;
	}
	public void enter(){
		//sets up cave when entered
		this.contents = "x";
	}

}
