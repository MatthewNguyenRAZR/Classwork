package arrays6;

public class practiceClass {
	
	public static String[][] twoDArr = new String[5][5];
	
	public static void main(String[] args){
		
		for(int row = 0;row < twoDArr.length;row++){
			for(int col = 0;col < twoDArr[row].length;col++){
				System.out.println(twoDArr[row][col]);
			}
		}
	}
}
