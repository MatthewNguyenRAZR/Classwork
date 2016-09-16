/**
 * 
 */
package introUnit;

/**
 * @author Student 6
 * This calss is designed to contrast with the 
 * ProceduralExample. It embodies an Object Or
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//contruct a student
		Student jillian = new Senior("Jillian");
		Student jason = new Student("Jason");
		Student jordan = new Student("Jordan");
		
		jillian.talk();
		jason.talk();
		jordan.talk();
	}

}
