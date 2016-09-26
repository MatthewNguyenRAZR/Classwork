package chatbox6;

import java.util.Scanner;
public class MatthewNMain {
	/*
		static Topic school;
		static Scanner input;
		static String user;
		static boolean inLoop;
		static String response;
		//static int lineCount;
		
		public static void main(String[] args) {
			createAScanner();
			//lineCount = 0;
			//demonstrateStringMethods();
			createTopics();
			promptName();
			talkForever();
		}
		public static String getInput(){
			return input.nextLine();
		}
		public static void promptName(){
			print("Hello, human! I am a board covered with semiconductors and other such "
					+ "electronic components, What is your name?");
			user = input.nextLine();
			print("Awesome, I will call you "+user+" until you terminate me.");
		}
		public static void talkForever(){
			inLoop = true;
			while(inLoop){
				print("Greetings, "+user+". How are you?");
				response = getInput();
				if(response.indexOf("good") >= 0)
					print("I'm so happy you're good");
				else if(response.indexOf("school")>0){
					inLoop = false;
					school.talk();
				}
				else{
					print("I'm sorry, I don't understand you.");
				}
					
				
				
			}
		}
		public static void print(String s){
			//lineCount++;
			//System.out.println("Line #"+lineCount+": "+s);
			
			//create a multi-line string
			String printString = "";
			int cutoff = 35;
			//check to see if there are words to add
			
			while(s.length()>0){
				String currentLine = "";
				String nextWord = "";
				//while currentLine/nextLine are less than cutoff, and there are still words to add
				//do the following
				while(currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
					//add the next word to the line
					currentLine += nextWord;
					//remove that word
					s = s.substring(nextWord.length());
					//get the following word
					int endOfWord = s.indexOf(" ");
					//check to see if this is the last word
					if(endOfWord == -1){
						endOfWord = s.length() -1;
					}
					//get the next word and space
					nextWord = s.substring(0,endOfWord+1);
				}
				printString += currentLine +"\n";
			}
				
			
			
		}
		public static void promptInput(){
			print(user+", type an input.");
			String userInput = input.nextLine();
			print("You typed: "+userInput);
		}
		public static void createAScanner(){
				input = new Scanner(System.in);
				school = new School();
		}
		public static void demonstrateStringMethods(){
			//String text = new String("Hello World"); //same thing
			String text1 = "Hello World";
			String text2 = "Hello ";
			String text3 = "World";

			if(text1 == text2+text3)
				System.out.println("These strings are equal.");
			else
				System.out.println("These strings are not equal.");
			
			//they look the same but are not the same:
			System.out.println(text1);
			System.out.println(text2+text3);
			
			String word1 = "Aardvark";
			String word2 = "Zyzzyva";
			if(word1.compareTo(word2) <0){
				System.out.println("Word1 is before word2."+" lexicongraphically");
			}
		
	}

}
*/
	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school;
	//static int lineCount;

	public static void main(String[] args) {
		createTopics();
		//lineCount = 0;
		//demonstrateStringMethods();
		//promptInput();
		promptName();
		talkForever();
		
	}
	
	private static void promptName() {
		print("I am a board covered with semiconductors and other electronic components. What is your name?");
		user = input.nextLine();
		print("Cool! I will call you "+user+" until you terminate me.");
	}

	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			//promptInput();
			print("Greetings, "+user+". How's it going?");
			response = getInput();
			if(findKeyword(response, "good", 0))
				print("Good looks");
			else if(response.indexOf("school")>=0){
				inLoop = false;
				school.talk();
			}
			else
				print("I'm sorry, I don't understand?");
		}
	}

	private static boolean findKeyword(String searchString, String key, int startIndex) {
			String phrase = searchString.trim().toLowerCase();
			//set all letters to lowercase
			key.toLowerCase();
			//find position of key
			int psn = phrase.indexOf(key);
			//kep looking for the word until you find the right context
		while(psn >= 0){
			//if phrase doesn't end with this word
			String before = " ";
			String after = " ";
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length()+1).toLowerCase();
			}
			//if the phrase does not begin with this word
			if(psn > 0){
				before = phrase.substring(psn-1,psn).toLowerCase();
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return true;
			}
			psn = phrase.indexOf(key,psn+1);
		}
		return false;
	}

	public static void promptInput() {
		print(user+", try inputting a string!");
		String userInput = input.nextLine();
		print("You typed: "+userInput);
		
	}

	public static void createTopics() {
		input = new Scanner(System.in);
		school = new School();
		
	}
	public static void print(String s){
		//create multiline string
		String printString = "";
		int cutOff = 35;
		//check if there are words to add
		//is length of s > 0?
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and nextWord are less than cutoff,AND THERE ARE STILL WORDS TO ADD,
			//do the following loooooooop
			while(currentLine.length() + nextWord.length() <= cutOff && s.length() > 0){
				//add the next word to line
				currentLine += nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				//get the next word
				int endOfWord = s.indexOf(" ");
				//check to see if this is the last word
				if(endOfWord == -1)
					endOfWord = s.length()-1;
				nextWord = s.substring(0,endOfWord+1);
			}
			printString += currentLine + "\n"; 
			
		}
		System.out.println(printString);
	}
	public static String getInput(){
		return input.nextLine();
	}
}