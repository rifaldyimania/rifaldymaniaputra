package pertemuan9;

abstract class Latihan9 {
    public void breath() {
        System.out.println("Berfikir menggunakan otak");
    }

    public void eat() {
        System.out.println("Makan melalui mulut");
    }

    public abstract void walk();
}

class Human extends Latihan9 {
    @Override
    public void walk() {
        System.out.println("Berjalan menggunakan kedua kaki");
    }
}

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.breath();
        h.eat();
        h.walk();
    }
}
