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

    public int getFloor() {
        return this.floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }


    @Override
    public String toString() {
        return String.format("Квартира площадью %s метров на %s этаже", getArea(), getFloor());
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
