package pertemuan9;
class Triangle {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public boolean isGreater(Triangle a, Triangle b) {
        return a.getArea() > b.getArea();
    }

    public boolean isLess(Triangle a, Triangle b) {
        return a.getArea() < b.getArea();
    }

    public boolean isEqual(Triangle a, Triangle b) {
        return a.getArea() == b.getArea();
    }
}

public class latihan3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 5); // luas 25
        Triangle t2 = new Triangle(8, 12); // luas 48
        Triangle t3 = new Triangle(10, 5); // luas 25

        System.out.println("Luas Segitiga 1: " + t1.getArea());
        System.out.println("Luas Segitiga 2: " + t2.getArea());
        System.out.println("Luas Segitiga 3: " + t3.getArea());

        System.out.println("Segitiga1 > Segitiga2 ? " + t1.isGreater(t1, t2));
        System.out.println("Segitiga1 < Segitiga2 ? " + t1.isLess(t1, t2));
        System.out.println("Segitiga1 == Segitiga3 ? " + t1.isEqual(t1, t3));
    }
}
