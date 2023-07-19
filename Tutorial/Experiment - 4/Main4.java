interface Vegetable {
    public void color();
    public void grow();
}

class Spinach implements Vegetable {
    public void color() {
        System.out.println("Color of spinach is green");
    }

    public void grow() {
        System.out.println("Spinach grows above ground");
    }
}

class Potato implements Vegetable {
    public void color() {
        System.out.println("Color of Potato is browny white");
    }

    public void grow() {
        System.out.println("Potato grows under ground");
    }
}

class Onion implements Vegetable {
    public void color() {
        System.out.println("Color of Onion is red");
    }

    public void grow() {
        System.out.println("Onion grows under ground");
    }
}

class Tomato implements Vegetable {
    public void color() {
        System.out.println("Color of Tomato is red");
    }

    public void grow() {
        System.out.println("Tomato grows above ground");
    }
}

class Main4 {
    public static void main(String[] args) {
        Vegetable spinach = new Spinach();
        spinach.color();
        spinach.grow();

        Vegetable potato = new Potato();
        potato.color();
        potato.grow();

        Vegetable onion = new Onion();
        onion.color();
        onion.grow();

        Vegetable tomato = new Tomato();
        tomato.color();
        tomato.grow();
    }
}
