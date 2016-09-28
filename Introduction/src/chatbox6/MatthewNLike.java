package chatbox6;

public class MatthewNLike implements Topic{
	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk(){
		MatthewNMain.print("What are some things uou like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = MatthewNMain.getInput();
			int likePsn = MatthewNMain.findKeyword(likeResponse,"like",0);
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn+5);
				MatthewNMain.print("You are such an interestin person because you like "+thingsLiked);
				if(MatthewNMain.findKeyword(thingsLiked,"school",0)>=0){
					inLikeLoop = false;
					MatthewNMain.school.talk();
				}
				else{
				inLikeLoop = false;
				MatthewNMain.talkForever();
				}
			}
			else{
				MatthewNMain.print("I don't understand you.");
			}
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		if(MatthewNMain.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		if(MatthewNMain.findKeyword(userInput, "class", 0)>=0){
			return true;
		}
		return false;
	}
}
