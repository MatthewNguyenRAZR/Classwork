package introUnit;

public class Sophmore extends Student{
	
	private String major;
	
	public Sophmore(String name, String major) {
		super(name);//super means go to superclass
		this.major = major;
	}
	
	public void talk(){
		super.talk();//call the super method
		System.out.println("... and I am a sophmore!");
		System.out.println("I am choosing "+major);
	}

}
