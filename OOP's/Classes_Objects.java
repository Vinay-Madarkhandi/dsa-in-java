public class Classes_Objects {
    public static void main(String[] args) {
        Bear b1 = new Bear();

        b1.eat();
        b1.walk();

    }
}

class Bank {
    public String userName;
    private String password;

    void setPassword(String password) {
        this.password = password;
    }

    void getPassword() {
        System.out.println(this.password);
    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal Eats");
    }

    // Basically here it just gives an idea that walk method is there and every
    // child class have its own implementation in this walk method

    abstract void walk();
}

class Horse extends Animal {
    // Here we have to implement this method compulsory because it inherit the
    // abstract class

    void walk() {
        System.out.println("walks on 4 legs ");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

// Here we obtain total abstraction over here .
// it is simply creating a blue print of an class .
interface ChessPlayer {
    void walk();
}

class Queen implements ChessPlayer {
    public void walk() {
        System.out.println("In all directions");
    }
}

class King implements ChessPlayer {
    public void walk() {
        System.out.println("In all directions but by 1 steps");
    }
}

interface Herberviour {
    void walk();
}

interface Carnivours {
    void eat();
}

class Bear implements Herberviour, Carnivours {
    public void eat() {
        System.out.println("It eats both . ");
    }

    public void walk() {
        System.out.println("It walks on 2 legs");
    }
}