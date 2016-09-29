package chatbox6;

public class School implements Topic{
	/*
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public School(){
		
	}
	
	public static void talk(){
		inSchoolLoop = true;
		while(inSchoolLoop){
			MatthewNMain.print("Tell me about school.");
			schoolResponse = MatthewNMain.getInput();
			
			if(schoolResponse.indexOf("stop")>= 0){
				inSchoolLoop = false;
				MatthewNMain.talkForever();
			}
			else{
				MatthewNMain.print("That's my favorite part of school too.");
			}
		}
	}
	public boolean isTriggered(String userInpuut){
		//String[] triggers = ("school","class","teacher");
		if(MatthewNMain.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		if(MatthewNMain.findKeyword(userInput, "class", 0)>=0){
			return true;
		}
		return false;
	}
	*/

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			MatthewNMain.print("Tell me about school");
			schoolResponse = MatthewNMain.getInput();
			if(schoolResponse.indexOf("stop") >=0){
				inSchoolLoop = false;
				MatthewNMain.talkForever();
			}
			else	
				MatthewNMain.print("That's my favorite part too!");
		}

	}

	public boolean isTriggered(String userInput) {
		//String[] triggers = {"school","class","teacher"};
		//use for loop to iterate thru array
		if (MatthewNMain.findKeyword(userInput, "school", 0)>=0)
			return true;
		if (MatthewNMain.findKeyword(userInput, "class", 0)>=0)
			return true;
		
		return false;
	}


}
