package arrays6;
//unused code (ignore)
import java.util.Random;
public class Demonstration {
	int[] OneToFifty = new int[50];
	int[] RandomInteger = new int[50];
	public int[] PopulateArrayOneToFifty(){
		for(int index=0;index<OneToFifty.length;index++){
			OneToFifty[index] = index+1;
		}
		System.out.println(OneToFifty);
		return OneToFifty;
	}
	public int[] PopulateArrayRandomInteger(){
		for(int index=0;index<RandomInteger.length;index++){
			double random  = Math.random();
			int RandomOnetoHundred = (int) (100 * random);//[0,99]
			RandomInteger[index] = RandomOnetoHundred;
		}
		System.out.println(RandomInteger);
		return RandomInteger;
		
	}
	
}
