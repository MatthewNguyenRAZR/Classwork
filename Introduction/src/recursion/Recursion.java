package recursion;

public class Recursion {
	private static void Recursion() {
		//with a for loop
		System.out.println("Using a for loop...");
		for(int i = 0; i < 5; i++){
			System.out.println("Hello everyone!");
		}
		
		System.out.println("Using recursion...");
		int numberOfTimes = 5;
		forLoop(numberOfTimes, new Action(){
			public void act(){
				System.out.println("Hello everone!");
			}
		});
	}

	private static void forLoop(int numberOfTimes, Action action) {
		if(numberOfTimes<2){
			action.act();
		}else{
			action.act();
			forLoop(numberOfTimes-1, action);
		}
		
	}

}
