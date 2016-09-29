package chatbox6;

public class MatthewNHello implements Topic{
	private boolean inHelloLoop;
	private String helloResponse;
	private int helloCount;
	//responses are constants (never change, always exists)
	private static String[] calmResponses = {"We've already said our hellos. Remember?", "Yes, hello to you too. Let's actually talk."};
	private static String[] angryResponses = {"OK seriously, this has to stop", "You are beginning to annoy me", "You already SAID Hello"};
	
	public MatthewNHello(){
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = MatthewNMain.getInput();
			//! is used for negotiations
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				MatthewNMain.talkForever();
			}
		}
	}
	
	private void printResponse() {
		//calm and angry response
		int responseIndex = 0;
		if(helloCount<5){
			//calm
			responseIndex = (int)(Math.random()*calmResponses.length);
			MatthewNMain.print(calmResponses[responseIndex]);
		}
		else{
			//angry
			responseIndex = (int)(Math.random()*angryResponses.length);
			MatthewNMain.print(angryResponses[responseIndex]);
		}
	}

	public boolean isTriggered(String userInput) {
		if(MatthewNMain.findKeyword(userInput, "hi", 0)>=0){
			return true;
		}
		if(MatthewNMain.findKeyword(userInput, "hello", 0)>=0){
			return true;
		}
		return false;
	}
	
	
}
