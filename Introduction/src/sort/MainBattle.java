package sort;

public class MainBattle {

	public static void main(String[] args) {
		 Pokemon raticate = new Pokemon("Raticate",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 raticate.iChooseYou();
		 bulbasaur.iChooseYou();
		 
		 System.out.println("Raticate is preparing to attack with super fang");
		 raticate.attack(bulbasaur, new Attack() {
		 
		 public void attack(Pokemon target) {
			 System.out.println("Super fang is used!");
			 int newHP = target.getHP()/2;
			 target.setHP(newHP);
		 }
		 });
		 
		 System.out.println("Bulbasaur is preparing to attack with poison.");
		 bulbasaur.attack(raticate, new Attack() {
		 
		 public void attack(Pokemon target) {
			 System.out.println("Poison powder is used!");
			 target.setPoisoned(true);
		 }
		 });		 
		 
		 raticate.lapse();
		 bulbasaur.lapse();
		 printScore(raticate, bulbasaur);
	}
	public static void printScore(Pokemon p1, Pokemon p2){
		System.out.println(p1.getName()+": "+p1.getHP());
		System.out.println(p2.getName()+": "+p2.getHP());
	}
	

}