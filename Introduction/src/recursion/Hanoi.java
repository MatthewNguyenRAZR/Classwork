package recursion;

public class Hanoi {
	public static void main(String[] args) {
		hanoi(8,"A","B","C");
	}
	private static void hanoi(int numberOfDiscs, String from, String mid, String to) {
		if(numberOfDiscs<2){
			print("Move from "+from+" to "+to);
		}else{
			//move all but the last one to peg B
			hanoi(numberOfDiscs-1,from,to,mid);
			//move the last one to C
			hanoi(1,from,mid,to);
			//move all but the last one to C
			hanoi(numberOfDiscs-1,mid,from,to);
		}
		
	}
	
	private static int moveCount = 1;
	
	private static void print(String string) {
		System.out.println("Move #"+moveCount+" "+string);
		moveCount++;
	}

}
