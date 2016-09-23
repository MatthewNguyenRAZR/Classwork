package chatbox6;

public class School implements Topic{
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public School(){
		
	}
	
	public void talk(){
		inSchoolLoop = true;
		while(inSchoolLoop){
			MatthewNMain.print("Tell me anout school.");
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
}
