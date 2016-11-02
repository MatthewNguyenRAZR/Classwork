package arrays6;

public class practiceClass {
	
	
	
	public static void main(String[] args){
		String[][] twoDArr = new String[10][8];
		for(int row = 0;row < twoDArr.length;row++){
			for(int col = 0;col < twoDArr[row].length;col++){
				System.out.print(twoDArr[row][col]);
			}
			System.out.println();
		}
	}
}
