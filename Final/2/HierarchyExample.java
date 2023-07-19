// Class A
class A {
    public void display() {
        System.out.println("This is class A");
    }
}

// Class B extends A
class B extends A {
    public void display() {
        System.out.println("This is class B");
    }
}

// Class C extends A
class C extends A {
    public void display() {
        System.out.println("This is class C");
    }
}

// Class D extends A
class D extends A {
    public void display() {
        System.out.println("This is class D");
    }
}

// Main class
class HierarchyExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        // Displaying class A
        a.display();

        // Displaying class B
        b.display();

        // Displaying class C
        c.display();

        // Displaying class D
        d.display();
    }
}
