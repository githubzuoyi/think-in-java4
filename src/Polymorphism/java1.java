 package Polymorphism;

class Cycle{
	public void running(int i) {
		System.out.print("im running by cycle:"+i);
	}
} 

class Unlcycle extends Cycle{
	public void running(int i) {
		System.out.print("im running by Unlcycle:"+i);
	}
}

class Bicycle extends Cycle{
	public void running(int i) {
		System.out.print("im running by Bicycle:"+i);
	}
}

class Tricycle extends Cycle{
	public void running(int i) {
		System.out.print("im running by Tricycle:"+i);
	}
}

class ride{
	public void ride(Cycle c) {
		c.running(1993);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unlcycle u1 = new Unlcycle();
		ride ali = new ride();
		ali.ride(u1);

	}
}
 
public class java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
