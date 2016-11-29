package sort;

public class pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public pokemon(String name, int level) {
		this.name = name;
		this.hp = 100;
		this.level = level;
		this.poisoned = false;
	}
	public void iChooseYou(){
		System.out.println(this.name);
		System.out.println(this.name);
	}
	public String getName(){
		return this.name;
	}
	public int setHP(int newHP){
		return this.hp = newHP;
	}
	public void setPoisoned(boolean b){
		this.poisoned = b;
	}
	public void lapse(){
		
	}
	public void attack(){
		
	}
}
