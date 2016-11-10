package caveExplorer6;

public class GameStartEvent implements Event {
	
	public static final String[] SEQ_1 = {"A spikey-haried guy with orange pants flies up to you.",
			"Have you arrived to save us from the treacherous Buu?",
			"We need your help."};
	public static final String[] SEQ_2 = {"Great, I will be busy meditating on my super yellow "
			+ "version while you figure out where Buu is.","By the way, here's a map."};
	public GameStartEvent() {
		
	}

	public void play(){
		readSequence(SEQ_1);
		CaveExplorer.print("Will you help us?");
		while(CaveExplorer.in.nextLine().indexOf("yes")<0){
			CaveExplorer.print("Please say yes, I beg you");
		}
		readSequence(SEQ_2);
		CaveExplorer.inventory.setHasMap(true);
	}

	private void readSequence(String[] seq) {
		for(String s : seq){
			CaveExplorer.print(s);
			CaveExplorer.print(" - - - Press enter - - - ");
			CaveExplorer.in.nextLine();
		}
	}
	

}
