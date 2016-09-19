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
		Student jillian = new Senior("Jillian","programmer");
		Student jason = new Sophmore("Jason","Software Major");
		Student jordan = new Student("Jordan");
		
		jillian.talk();
//		jillian.name = "Test";
//		jillian.talk();
		jason.talk();
		jordan.talk();
	}

}
