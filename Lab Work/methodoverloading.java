class Adddemo {
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(int a, int b) {
		return a+b;
	}
}
class methodoverloading {
	public static void main(String args[]) {
		Adddemo a=new Adddemo();
		System.out.println("Two number add is "+a.add(5,6));
		System.out.println("Three number add is "+a.add(5,6,7));
		System.out.println("Double number add is "+a.add(10.6,11.5));
		System.out.println("Double number add is "+a.add(10,11));
	}
	
}