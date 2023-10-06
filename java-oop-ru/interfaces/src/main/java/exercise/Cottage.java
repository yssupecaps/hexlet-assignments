package exercise;

// BEGIN

class Cottage implements Home {

    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    public int getFloorCount() {
        return this.floorCount;
    }

    @Override
    public String toString() {
        return String.format("%s этажный коттедж площадью %s метров", getFloorCount(), getArea());
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
