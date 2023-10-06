package exercise;

// BEGIN
public class Flat implements Home {

    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getFloor() {
        return this.floor;
    }

    @Override
    public double getArea() {
        double square = area + balconyArea;
        return square;
    }


    @Override
    public String toString() {
        return String.format("Квартира площадью %s метров на %n этаже", getArea(), getFloor());
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        } else if (this.getArea() < another.getArea()) {
            return -1;
        } else
            return 0;
    }
}
// END
