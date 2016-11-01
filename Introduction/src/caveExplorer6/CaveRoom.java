package caveExplorer6;
/*
public class CaveRoom {

//4 walls
//caveRoom[] = borderingRooms
//Door[] doors
//controls: w,a,s,d (space) to do activity
//contents in each room (including you) ex: treasure,key
//each room has description

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
	public void setConnection(CaveRoom caveRoom) {
		// TODO Auto-generated method stub
		
	}

}
*/
public class CaveRoom {

	private String description;
	private String directions;
	private String contents;
	private String defaultContents;

	private CaveRoom[] borderingRooms;
	private Door[] doors; 

	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;


	public CaveRoom(String description){
		this.description = description;
		setDefaultContents("   ");
		contents = defaultContents;
		
		borderingRooms = new CaveRoom[4];
		doors = new Door[4];
		for(int i = 0 ; i < borderingRooms.length; i++){
			borderingRooms[i] = null;
			doors[i] = null;
		}
		setDirections();
	}

	protected void setDirections() {
		directions	= "";
		if(doors[NORTH] == null && 
				doors[EAST] == null &&
				doors[SOUTH] == null &&
				doors[WEST] == null){
			directions = "\n\nThis is a room with no exit. You will die here.";		
		}else{
			for(int dir = 0; dir < doors.length; dir++){
				if(doors[dir] != null){
					directions += "\n   There is a "+doors[dir].getDescription()+" to "+toDirection(dir)+". "+doors[dir].getDetails();
				}
			}
		}
	
	}

	public String getContents(){
		return contents;
	}
	
	public void enter(){
		contents = " X ";
	}
	
	public void leave(){
		contents = defaultContents;
	}
	
	public void setDefaultContents(String symbol){
		defaultContents = symbol;
	}
	

	public void addRoom(int direction, CaveRoom anotherRoom, Door door){
		borderingRooms[direction] = anotherRoom;
		doors[direction] = door;
		setDirections();
	}
	
	/**
	 * Gives this room access to anotherRoom (and vice-versa) and
	 * sets a door between them, and updates the directions
	 * @param direction
	 * @param anotherRoom
	 * @param door
	 */
	public void setConnection(int direction, CaveRoom anotherRoom, Door door){
		addRoom(direction, anotherRoom, door);
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
	}

	/**
	 * 
	 * @param dir
	 * @return opposite direction of dir (NORTH returns SOUTH...)
	 */
	public static int oppositeDirection(int dir){
		return (dir+2)%4;
	}

	
	public String getDescription(){
		return description+directions;
	}

	

	
	public Door getDoor(int dir){
		return doors[dir];
	}


	public void setDescription(String string) {
		description = string;
	}

}