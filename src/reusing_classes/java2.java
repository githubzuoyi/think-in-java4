package reusing_classes;

class Art{
	Art() {
		System.out.println("i construct myself");
	}
}

public class java2 extends Art{
	
	java2(){
		System.out.println("i'm java2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java2 alliy = new java2();
	}

}


class A extends C{
	A(){
		System.out.println("i'm A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C heizi = new C();
	}
}

class B{
	B(){
		System.out.println("i'm B");
	}
}

class C{
	B aliy = new B();
}



//

class Game{
	Game(int s){
		System.out.println("i'm Game");
	}
}

class Chess extends Game{
	Chess(){	
		super(1);
		System.out.println("i'm Chess");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess ali = new Chess();
	}
}
