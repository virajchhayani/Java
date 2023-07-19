abstract class Insect {
    public abstract void flyStatus();
}

class Termite extends Insect {
    public void flyStatus() {
        System.out.println("Termite cannot fly");
    }
}

class Grasshopper extends Insect {
    public void flyStatus() {
        System.out.println("Grasshopper can fly");
    }
}

class Ant extends Insect {
    public void flyStatus() {
        System.out.println("Ant cannot fly");
    }
}

class Main2 {
    public static void main(String[] args) {
        Insect termite = new Termite();
        termite.flyStatus();

        Insect grasshopper = new Grasshopper();
        grasshopper.flyStatus();

        Insect ant = new Ant();
        ant.flyStatus();
    }
}
