package arrays6;

public class practiceClass {
	
	
	
	public static void main(String[] args){
		boolean[][] mines = new boolean[6][6];
		createMines(mines,10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field,mines);
		printPic(field);
	}
	private static void createMines(boolean[][] mines, int numberOfMines){
		while(numberOfMines>0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
	}
	
	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0;row < field.length;row++){
			for(int col = 0;col < field[0].length;col++){
				if(mines[row][col]){
					field[row][col] = "X";
				}else{
					field[row][col] = countAdjacent(mines, row, col);
				}
			}
		}
		
	}
	
	private static String countAdjacent(boolean[][] mines, int r, int c) {
		//r and c represent coordinates of element we are providing a String for
		int count = 0;
		//loop through row above to row below
		for(int row = r-1;row <= r+1;row++){
			//loop through col left to col right
			for(int col = c-1;col <= c+1;col++){
				//exclude this element when counting
				if(row!=r && col!=c){
					if(row >= 0 && row < mines.length && col >= 0 && col < mines[row].length){
						
					}
				}
			}
		}
		return null;
	}
	public static void printBackgroundBorders(){
		String[][] pic = new String[10][8];
		for(int row = 0;row < pic.length;row++){
			for(int col = 0;col < pic[row].length;col++){
				pic[row][col] = " ";
			}
			//System.out.println();
		}
		pic[1][2] = "0";
		pic[0][2] = "|";
		pic[2][2] = "|";
		pic[1][1] = "-";
		pic[1][3] = "-";
		pic[0][1] = "\\";
		pic[2][3] = "\\";
		pic[0][3] = "/";
		pic[2][1] = "/";
		/*
		for(int row = 3;row < pic.length-4;row++){
			
			for(int col = 0;col < pic[row].length/2;col++){
				int randomBirdSpawn = (int) (Math.random()*4);
				if(randomBirdSpawn==1){
					pic[row][col] = "V ";
				}else{
					pic[row][col] = "  ";
				}
				
			}
			//System.out.println();
		}
		*/
		for(int row = 7;row < pic.length;row++){
			for(int col = 0;col < pic[row].length;col++){
				pic[row][col] = "M";
			}
			//System.out.println();
		}
		//top and bottom row is"_"
		for(int col = 0;col < pic[0].length;col++){
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";
		}
		//left and right col = "|"\
		for(int row = 0;row < pic.length;row++){
			pic[row][0] = "|";
			pic[row][pic[0].length-1] = "|";
		}
		printPic(pic);
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
