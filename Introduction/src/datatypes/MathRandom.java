package datatypes;
import java.util.Random;
public class MathRandom {

	public static void main(String[] args) {
		
		//same as int() results = (0,0,0,0,0,0)
		
		for(int index = 0; index < 10; index++){
			System.out.println("Roll #"+(index+1)+" Die is "+rollUnfairDie());
		}
		
		/*
		int[] results = new int[6];
		
		for(int i = 0; i < 1000000; i++){
			results[rollUnfairDie()]++;
		}
		
		for(int x = 0; x < 6; x++){
			System.out.println((x+1)+" was rolled "+results[x]+" times.");
		}
		*/
	}
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6)+1;
		/*
		double rand  = Math.random();// random double between (0,1)exclusive, wont be 1 or 0
		int roll1 = (int) (6 * rand);//[0,5]
		return roll1 +1;//[1,6]
		*/
	}
	
	public static int rollUnfairDie(){
		double rand1  = Math.random();
		int roll1 = (int) ((6 * rand1)+1);//[1,6]
		
		double rand2  = Math.random();
		int roll2 = (int) (2 * rand2);//[0,1]
		/*
		if(roll2 == 0){
			return roll1;
			}
		else{
			if(roll1 < 3){
				double rand3  = Math.random();
				int roll3 = (int) ((6 * rand3)+1);
				return roll3;
			}
		}
		*/
		return roll1+roll2;
	}
}

