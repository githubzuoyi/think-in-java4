package reusing_classes;

class Detergent {
	private String s="deter";
	public void go() {
		System.out.println("go");
	}
	public void scrub() {
		System.out.println("scrub");
	}
	public String  goon() {
		System.out.println("goon");
		return "goon";
	}
	public String toString() {
		return s + goon();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent lily = new Detergent();
	}
}

public class test1 extends Detergent{
	public void scrub() {
		System.out.println("super_scrub");
		super.scrub();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 lily = new test1();
		lily.scrub();
	}

}
